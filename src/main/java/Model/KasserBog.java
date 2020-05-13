package Model;

import Mapper.RestanceMapper;

import java.util.ArrayList;

public class KasserBog {
    int id;
    String navn;
    Boolean harbetalt;
    ArrayList<Medlem> medlemmerIRestance;
    RestanceMapper rm;

    public KasserBog() {
        /*
        medlemmer = new ArrayList<Medlem>();
        mm  = new MedlemsMapper();
        medlemmer = mm.getAllMedlemmer();
         */
        medlemmerIRestance = new ArrayList<>();
        rm = new RestanceMapper();
        medlemmerIRestance = rm.getAllRestancer();
    }

    public ArrayList<Medlem> getMedlemmer() {
        return medlemmerIRestance;
    }
    public void tilfoejMedlemTilBog(int medlemsId) {
        //tilføjer medlemsobject til medlemsliste
        Medlem medlem = getMedlemById(medlemsId);
        medlemmerIRestance.add(medlem);
        rm.tilfoejMedlemByIdTilRestanceListe(medlemsId);
        //lav medlem i databasen
    }
    public void sletMedlemFraBog(int medlemsId) throws MedlemNotFoundException{
        Medlem medlem = getMedlemById(medlemsId);
        if (medlem == null){
            throw new MedlemNotFoundException();
        }
        medlemmerIRestance.remove(medlem);
        rm.medlemHarBetalt(medlemsId);
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
