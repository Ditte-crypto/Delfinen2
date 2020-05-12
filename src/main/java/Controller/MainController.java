package Controller;

import Model.Formand;
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
                while(menuValg!=99) {
                    menuValg = formandView.formandsMenu();
                    ArrayList<Object> medlemsData = formandView.formandsMain(menuValg);
                    formand.lavNytMedlem(medlemsData, medlemsBog);
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
