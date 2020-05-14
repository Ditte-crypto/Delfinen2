package Model;

import Mapper.ResultatMapper;

import java.util.ArrayList;

public class ResultatBog{

    ResultatMapper resultatMapper;
    ResultatBog resultatBog;
    ArrayList<Resultat> resultater;

    public ResultatBog(){
        resultatMapper = new ResultatMapper();
        resultatBog = new ResultatBog();
        resultater = resultatMapper.getAllResultater();
    }

    public ArrayList<Resultat> getResultater() {
        return resultater;
    }


    public void tilfoejResultatTilBog(Resultat resultat) {
        //Medlem medlem = getMedlemById(id);
        resultater.add(resultat);
        resultatMapper.tilfoejMedlemTilResultat(resultat);
    }


    public void sletResultatFraBog(int id) throws ResultatNotFoundException {
        Resultat resultat = getResultatById(id);
        resultater.remove(resultat);
    }


    public Resultat getResultatById(int id) {
        Resultat retResultat = null;
        for (Resultat r: resultater){
            if(id == r.getResultatid()){
                retResultat = r;
            }
        }
        return retMedlem;
    }

    /*
    får medlemmer fra databasen som er registreret som konkurrencesvømmere
    vi har også en metode, der registrerer et medlem som konkurrencevømmer
     */

}
