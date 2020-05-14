package Model;

import java.util.ArrayList;

public class Traener {

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
        Medlem id = (Medlem) medlemsinfo.get(0);
        String staevne = (String) medlemsinfo.get(1);
        int tid = (int) medlemsinfo.get(2);
        Distance distance = (Distance) medlemsinfo.get(3);
        Disciplin disciplin = (Disciplin) medlemsinfo.get(4);
        Resultat resultat = new Resultat(id, staevne, tid, distance, disciplin);
        resultatBog.tilfoejMedlemTilBog(resultat);
    }
}
