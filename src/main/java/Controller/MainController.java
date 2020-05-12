package Controller;

import Model.Formand;
import Model.MedlemNotFoundException;
import Model.MedlemsBog;
import Model.User;
import View.FormandView;
import View.MainView;

import java.util.ArrayList;

public class MainController {
    public void run(){
        MainView mv = new MainView();
        User loggedInUser = mv.getInfo();
        MedlemsBog medlemsBog = new MedlemsBog();
        int menuValg = 0;
        switch(loggedInUser.getRole()){
            case "formand":
                Formand formand = new Formand();
                FormandView formandView = new FormandView();
                menuValg = formandView.formandsMenu();
                MainView mainView = new MainView();

                    switch (menuValg) {
                        case 1 :
                        ArrayList<Object> medlemsData = formandView.inputMedlemsData();
                        formand.lavNytMedlem(medlemsData, medlemsBog);
                        break;
                        case 2 : formandView.visAlleMedlemmer(medlemsBog);
                        formandView.formandsMenu();
                        break;
                        case 3 : int sletMedlemsNummer = formandView.sletMedlemDialog(medlemsBog);
                            try {
                                medlemsBog.sletMedlemFraBog(sletMedlemsNummer);
                                formandView.formandsMenu();
                            } catch (MedlemNotFoundException e) {
                                e.printStackTrace();
                            }
                            break;
                        case 99 : mainView.getInfo();
                    }
                    break;
            case "kasser" :
                break;
            case "traener":
                break;
            default:
        }
    }
}
