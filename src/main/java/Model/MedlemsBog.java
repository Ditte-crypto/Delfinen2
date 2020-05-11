package Model;

import Mapper.MedlemsMapper;

import java.util.ArrayList;

public class MedlemsBog extends Bog {
    static ArrayList<Medlem> medlemmer;

    public static void tilfoejMedlemTilBog(Medlem medlem) {
        //tilføjer medlemsobject til medlemsliste
        medlemmer.add(medlem);
        MedlemsMapper.lavNytMedlem(medlem);
        //lav medlem i databasen
    }
}
