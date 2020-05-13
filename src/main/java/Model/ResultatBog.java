package Model;

import Mapper.ResultatMapper;

import java.util.ArrayList;

public class ResultatBog extends Bog{

    ArrayList<Medlem> konkurrencesvoemmere;
    ResultatMapper resultatMapper;

    public ResultatBog(){
        konkurrencesvoemmere = new ArrayList<Medlem>();
        resultatMapper = new ResultatMapper();
        konkurrencesvoemmere = resultatMapper.getAllKonkurrencesvoemmere();
    }
    @Override
    public ArrayList<Medlem> getMedlemmer() {
        return konkurrencesvoemmere;
    }

    @Override
    public void tilfoejMedlemTilBog(int id) {

    }

    @Override
    public void sletMedlemFraBog(int id) throws MedlemNotFoundException {

    }

    @Override
    public Medlem getMedlemById(int id) {
        Medlem retMedlem = null;
        for (Medlem m: konkurrencesvoemmere){
            if(id == m.getId()){
                retMedlem = m;
            }
        }
        return retMedlem;
    }
    /*
    får medlemmer fra databasen som er registreret som konkurrencesvømmere
    vi har også en metode, der registrerer et medlem som konkurrencevømmer
     */

}
