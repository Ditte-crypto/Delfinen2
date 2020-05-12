package View;

import Mapper.MedlemsMapper;
import Model.Formand;
import Model.Medlem;
import Model.MedlemsBog;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FormandView {
    /*
    Her er formandens interaktion med programmet
     */
    public int formandsMenu(){
        int retInt = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Velkommen formand!"+
                "[1] : for at tilføje medlem"+
                "[2] : vis alle medlemmer"+
                "[3] : slet et medlem"+
                "[99] : forlad programmet");
        retInt = in.nextInt();
        return retInt;
    }
    public int formandsMenu(ArrayList<Object> retList){
        int formandsMenuValg = (int) retList.get(0);
        return formandsMenuValg;
    }

    public ArrayList<Object> inputMedlemsData(){
        ArrayList<Object> retList = new ArrayList<Object>();
        Scanner in = new Scanner(System.in);

        System.out.println("Du er nu igang med at tilføje et nyt medlem."+
                "Navn: ");
        String navn = in.nextLine();
        retList.add(navn);

        System.out.println("Årgang: ");
        int aargang = in.nextInt();
        retList.add(aargang);

        System.out.println("Har medlemmet betalt? true/false");
        Boolean betalt = in.nextBoolean();
        retList.add(betalt);

        System.out.println("Er medlemmet aktivt? true/false");
        Boolean aktiv = in.nextBoolean();
        retList.add(aktiv);
        System.out.println("Du har tilføjet et nyt medlem.");

        return retList;
    }


    public void visAlleMedlemmer(MedlemsBog medlemsBog){
        ArrayList<Medlem> medlemmer = medlemsBog.getMedlemmer();
        for(Medlem m : medlemmer){
            System.out.println(m);
        }
    }
    public int sletMedlemDialog(MedlemsBog medlemsBog){
        Scanner in = new Scanner(System.in);
        visAlleMedlemmer(medlemsBog);
        System.out.println("Skriv id på medlemmet du vil udmelde: ");
        int retInt = in.nextInt();
        return retInt;
    }
}
