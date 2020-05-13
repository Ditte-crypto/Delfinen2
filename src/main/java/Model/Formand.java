package Model;

import Mapper.MedlemsMapper;
import View.FormandView;

import java.util.ArrayList;

public class Formand extends  User{
    FormandView view;
    public Formand(String name, String password, String role) {
        super(name,password,role);
        this.view = new FormandView();

    }

    @Override
    public void showMenu() {
        int menuValg = 0;
        while (menuValg!= 99) {

            view.formandsMenu();
            sc.nextInt();
            switch (menuValg) {
                case 1:
                    ArrayList<Object> medlemsData = view.inputMedlemsData();
                    lavNytMedlem(medlemsData, medlemsBog);
                    break;
                case 2:
                    view.visAlleMedlemmer(medlemsBog);
                    break;
                case 3:
                    int sletMedlemsNummer = view.sletMedlemDialog(medlemsBog);
                    try {
                        medlemsBog.sletMedlemFraBog(sletMedlemsNummer);
                    } catch (MedlemNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 99:
            }
        }
    }
    public void lavNytMedlem(ArrayList<Object> medlemsinfo, MedlemsBog medlemsBog){
        //lav medlemsobject Medlem medlem = nyt Medlem(); bedre med hashmap
        String navn = (String) medlemsinfo.get(0);
        int aargang = (int) medlemsinfo.get(1);
        Boolean betalt = (Boolean) medlemsinfo.get(2);
        Boolean aktiv = (Boolean) medlemsinfo.get(3);
        Medlem medlem = new Medlem(navn, aargang, betalt, aktiv);
        medlemsBog.tilfoejMedlemTilBog(medlem);
    }

}
