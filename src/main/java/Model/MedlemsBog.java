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

    public ArrayList<Medlem> getMedlemmer() {
        return medlemmer;
    }

    public void tilfoejMedlemTilBog(Medlem medlem) {
        //tilføjer medlemsobject til medlemsliste

        medlemmer.add(medlem);
        mm.lavNytMedlem(medlem);
        //lav medlem i databasen
    }
    public void sletMedlemFraBog(int medlemsNr) throws MedlemNotFoundException{
        Medlem medlem = getMedlemById(medlemsNr);
        if (medlem == null){
            throw new MedlemNotFoundException();
        }
        medlemmer.remove(medlem);
        mm.deleteMedlem(medlemsNr);
    }
    public Medlem getMedlemById(int id){
        Medlem retMedlem = null;
        for (Medlem m: medlemmer){
            if(id == m.getId()){
                retMedlem = m;
            }
        }
        return retMedlem;
    }
}
