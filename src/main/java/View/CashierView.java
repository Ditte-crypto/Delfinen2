package View;


import java.util.ArrayList;
import java.util.Scanner;

public class CashierView {
    public void mainMenu(){
        System.out.println("Velkommen kasserer!"+
                "[1] : se alle medlemmer i restance"+
                "[2] : vis alle medlemmer"+
                "[3] : registrer betaling"+
                "[99] : forlad programmet");
    }

    public int formandsMenu(ArrayList<Object> retList){
        int formandsMenuValg = (int) retList.get(0);
        return formandsMenuValg;
    }
}
