package Model;

import java.util.ArrayList;

public class KasserBog {
    int id;
    String navn;
    Boolean harbetalt;
    ArrayList<Object> medlemmerIRestance;
    KasserMapper km;

    public KasserBog(ArrayList<Object> medlemmerIRestance) {
        /*
        medlemmer = new ArrayList<Medlem>();
        mm  = new MedlemsMapper();
        medlemmer = mm.getAllMedlemmer();
         */
        medlemmerIRestance = new ArrayList<>();
        km = new KasserMapper();
        medlemmerIRestance = km.getAllRestancer();
    }

    public ArrayList<Object> getMedlemmerIRestance() {
        return medlemmerIRestance;
    }
    public void tilfoejMedlemTilBog(Medlem medlem) {
        //tilføjer medlemsobject til medlemsliste

        medlemmerIRestance.add(medlem);
        km.lavNytMedlem(medlem);
        //lav medlem i databasen
    }
    public void sletMedlemFraBog(int medlemsNr) throws MedlemNotFoundException{
        Medlem medlem = getMedlemById(medlemsNr);
        if (medlem == null){
            throw new MedlemNotFoundException();
        }
        medlemmerIRestance.remove(medlem);
        km.deleteMedlem(medlemsNr);
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
