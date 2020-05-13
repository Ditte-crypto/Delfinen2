package Model;

import Mapper.RestanceMapper;

import java.util.ArrayList;

public class KasserBog {
    int id;
    String navn;
    Boolean harbetalt;
    ArrayList<Object> medlemmerIRestance;
    RestanceMapper rm;

    public KasserBog(ArrayList<Object> medlemmerIRestance) {
        /*
        medlemmer = new ArrayList<Medlem>();
        mm  = new MedlemsMapper();
        medlemmer = mm.getAllMedlemmer();
         */
        medlemmerIRestance = new ArrayList<>();
        rm = new RestanceMapper();
        medlemmerIRestance = rm.getAllRestancer();
    }

    public ArrayList<Object> getMedlemmer() {
        return medlemmerIRestance;
    }
    public void tilfoejMedlemTilBog(Medlem medlem) {
        //tilføjer medlemsobject til medlemsliste

        medlemmerIRestance.add(medlem);
        rm.lavNytMedlem(medlem);
        //lav medlem i databasen
    }
    public void sletMedlemFraBog(int medlemsNr) throws MedlemNotFoundException{
        Medlem medlem = getMedlemById(medlemsNr);
        if (medlem == null){
            throw new MedlemNotFoundException();
        }
        medlemmerIRestance.remove(medlem);
        rm.deleteMedlem(medlemsNr);
    }
    public Medlem getMedlemById(int id){
        Medlem retMedlem = null;
        for (Medlem m: medlemmerIRestance){
            if(id == m.getId()){
                retMedlem = m;
            }
        }
        return retMedlem;
    }
}
