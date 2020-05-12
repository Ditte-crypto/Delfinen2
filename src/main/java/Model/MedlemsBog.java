package Model;

import Mapper.MedlemsMapper;

import java.util.ArrayList;

public class MedlemsBog extends Bog {
    ArrayList<Medlem> medlemmer;
    MedlemsMapper mm;
    public MedlemsBog() {
        medlemmer = new ArrayList<Medlem>();
        mm  = new MedlemsMapper();
        medlemmer = mm.getAllMedlemmer();
    }

    public void tilfoejMedlemTilBog(Medlem medlem) {
        //tilføjer medlemsobject til medlemsliste

        medlemmer.add(medlem);
        mm.lavNytMedlem(medlem);
        //lav medlem i databasen
    }
}
