package Model;

import java.util.ArrayList;

public class ResultatBog extends Bog{

    ArrayList<Medlem> konkurrencesvoemmere;

    @Override
    public ArrayList<Medlem> getMedlemmer() {
        return null;
    }

    @Override
    public void tilfoejMedlemTilBog(int id) {

    }

    @Override
    public void sletMedlemFraBog(int id) throws MedlemNotFoundException {

    }

    @Override
    public Medlem getMedlemById(int id) {
        return null;
    }
    /*
    får medlemmer fra databasen som er registreret som konkurrencesvømmere
    vi har også en metode, der registrerer et medlem som konkurrencevømmer
     */

}
