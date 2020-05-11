package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FormandView {
    /*
    Her er formandens interaktion med programmet
     */
    public int lavNytMedlem(){
        int retInt = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Velkommen formand!"+
                "[1] : for at tilføje medlem");
        retInt = in.nextInt();
        return retInt;
    }
    public List<Object> formandsMain(int brugerInput){
        List<Object> retList = new ArrayList<Object>();
        switch(brugerInput) {
            case 1 : retList = inputMedlemsData();
                    break;
        }
        return retList;
    }
    public List<Object> inputMedlemsData(){
        List<Object> retList = new ArrayList<Object>();
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
        return retList;
    }
}
