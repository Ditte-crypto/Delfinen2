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
        loggedInUser.showMenu();
    }
}
