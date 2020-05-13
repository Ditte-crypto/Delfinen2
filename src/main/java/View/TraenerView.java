package View;

import Model.Medlem;
import Model.ResultatBog;

import java.util.Scanner;

public class TraenerView {

    public int TrænerMenu() {

        int retInt = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Velkommen Træner!" +
                "[1] : for at vise bedste svømmetider" +
                "[2] : tilføj stævneresultater" +
                "[3] : tilføj træningsresultater" +
                "[4] : tilføj svømmer til konkurrencehold"+
                "[5] : vis svømmere på konkurrencehold"+
                "[99] : forlad programmet");
        retInt = in.nextInt();
        return retInt;
    }
    public int lavNyKonkurrencesvoemmer(){
        //viser alle medlemmer og lader træner vælge 1 ud fra id, som returneres til maincontroller
    }
    public void visBedsteSvoemmeTider(Medlem medlem, ResultatBog resultatBog){
        //top 5 bedste sømmere fordelt på de 4 discipliner efter både junior og senior
        /*
        Junior:
        id, navn, aargang,
            Resultater: placering i klub, stilart, distance, tid
                        placering i klub, stilart, distance, tid
        id, navn, aargang,
            Resultater: placering i klub, stilart, distance, tid
                        placering i klub, stilart, distance, tid
        2. medlem
        3. medlem
        4. medlem
        5. medlem

        Senior:
        1. medlem
        2. medlem
        3. medlem
        4. medlem
        5. medlem

         */
    }
}
