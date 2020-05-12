package Model;

import java.util.ArrayList;

public class Formand {
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
