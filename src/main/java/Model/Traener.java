package Model;

import java.util.ArrayList;

public class Traener {

    MedlemsBog medlemsBog = new MedlemsBog();
    /*
    public Resultat(Medlem medlem, String staevne, int tid, Distance distance, Disciplin disciplin) {
        this.medlem = medlem;
        this.staevne = staevne;
        this.tid = tid;
        this.distance = distance;
        this.disciplin = disciplin;
    }
     */

    public void lavNytMedlem(ArrayList<Object> medlemsinfo, ResultatBog resultatBog){
        //lav medlemsobject Medlem medlem = nyt Medlem(); bedre med hashmap
        int id = (int) medlemsinfo.get(0);
        String staevne = (String) medlemsinfo.get(1);
        int tid = (int) medlemsinfo.get(2);
        Distance distance = Distance.FIREHUNDREDE; //Distance.valueOf(medlemsinfo.get(3));
        Disciplin disciplin = Disciplin.BUTTERFLY;//Disciplin.valueOf(medlemsinfo.get(4));
        Medlem medlem = medlemsBog.getMedlemById(id);
        Resultat resultat = new Resultat(medlem, staevne, tid, distance, disciplin);
        resultatBog.tilfoejResultatTilBog(resultat);
    }
}