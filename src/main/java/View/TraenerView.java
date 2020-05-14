package View;

import Model.Medlem;
import Model.ResultatBog;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class TraenerView {

    public int traenerMenu() {

        int retInt = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Velkommen Træner!\n" +
                "[1] : tilføj resultater\n" +
                "[2] : for at vise bedste svømmetider\n" +
                "[3] : Fjern resultater\n" +
                "[99] : forlad programmet\n");
        retInt = in.nextInt();
        return retInt;
    }
    public int lavNyKonkurrencesvoemmer(){
        //viser alle medlemmer og lader træner vælge 1 ud fra id, som returneres til maincontroller
        return 0;
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
    public void visKonkurrencesvoemmere(ResultatBog resultatBog){
        ArrayList<Medlem> svoemmere = resultatBog.getMedlemmer();
        for (Medlem m : svoemmere){
            System.out.println(m);
        }
    }
    public AtomicReference<ArrayList<Object>> inputResultatsData(){
        ArrayList<Object> retList = new ArrayList<Object>();
        Scanner in = new Scanner(System.in);

        System.out.println("Du er nu igang med at registrere et resultat."+
                "Id på svømmer: ");
        int id = in.nextInt();
        retList.add(id);

        System.out.println("Stævne: ");
        String staevne = in.nextLine();
        retList.add(staevne);

        System.out.println("Hvad er tiden? ");
        int tid = in.nextInt();
        retList.add(tid);

        System.out.println("Hvad er distancen?");
        String distance = in.nextLine();
        retList.add(distance);

        System.out.println("Hvilken disciplin?");
        String disciplin = in.nextLine();
        retList.add(disciplin);


        return retList;
    }
// public Resultat(Medlem medlem, int resultatid, String staevne, int tid, Distance distance, Disciplin disciplin) {
//        this.medlem = medlem;
//        this.resultatid = resultatid;
//        this.staevne = staevne;
//        this.tid = tid;
//        this.distance = distance;
//        this.disciplin = disciplin;
//    }
}

