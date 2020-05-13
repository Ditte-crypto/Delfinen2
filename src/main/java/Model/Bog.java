package Model;

import java.util.ArrayList;

public abstract class Bog {
    abstract public ArrayList<Medlem> getMedlemmer();
    abstract public void tilfoejMedlemTilBog(int id);
    abstract public void sletMedlemFraBog(int id) throws MedlemNotFoundException;
    abstract public Medlem getMedlemById(int id);
}
