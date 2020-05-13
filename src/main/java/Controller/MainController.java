package Controller;

import Mapper.RestanceMapper;
import Model.*;
import View.FormandView;
import View.KasserView;
import View.MainView;

import java.util.ArrayList;

public class MainController {
    public void run(){
        MainView mainView = new MainView();
        User loggedInUser = mainView.getInfo();
        MedlemsBog medlemsBog = new MedlemsBog();
        int menuValg = 0;
        switch(loggedInUser.getRole()){
            case "formand":formandsRun(menuValg, medlemsBog, mainView);
                break;
            case "kasser" : kasserRun(mainView, menuValg);
                break;
            case "traener"://traenerRun();
                break;
            default:
        }
    }
    public void kasserRun(MainView mainView, int menuValg){
        Kasser kasser = new Kasser();
        KasserView kasserView = new KasserView();
        menuValg = kasserView.kasserMenu();
        mainView = new MainView();
        KasserBog kasserBog = new KasserBog();
        RestanceMapper restanceMapper = new RestanceMapper();
        MedlemsBog medlemsBog = new MedlemsBog();
        switch(menuValg){
            case 1 : //se medlemmer i restance
                kasserView.visMedlemmerIRestance(kasserBog);
                break;
            case 2 : //regsitrer betaling
                int id1 = kasserView.idPaaMedlemDerHarBetalt(kasserBog);
                restanceMapper.medlemHarBetalt(id1);
            case 3 : //registrer medlem til at være i restance
                int id2 = kasserView.idPaaMedlemDerErIRestance(medlemsBog);
                restanceMapper.tilfoejMedlemByIdTilRestanceListe(id2);
                break;
            case 99 : mainView.getInfo();
                break;
            default :
                System.out.println("ugyldigt input");
                break;
        }
        kasserRun(mainView, menuValg);
    }
    public void formandsRun(int menuValg, MedlemsBog medlemsBog, MainView mainView) {
        Formand formand = new Formand();
        FormandView formandView = new FormandView();
        menuValg = formandView.formandsMenu();
        mainView = new MainView();
        switch (menuValg) {
            case 1:
                ArrayList<Object> medlemsData = formandView.inputMedlemsData();
                formand.lavNytMedlem(medlemsData, medlemsBog);
                break;
            case 2:
                formandView.visAlleMedlemmer(medlemsBog);
                formandView.formandsMenu();
                break;
            case 3:
                int sletMedlemsNummer = formandView.sletMedlemDialog(medlemsBog);
                try {
                    medlemsBog.sletMedlemFraBog(sletMedlemsNummer);
                    formandView.formandsMenu();
                } catch (MedlemNotFoundException e) {
                    e.printStackTrace();
                }
                break;
            case 99:
                mainView.getInfo();
        }
    }
}
