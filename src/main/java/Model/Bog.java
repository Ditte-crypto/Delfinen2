package Model;

import java.util.ArrayList;

public abstract class Bog {
    abstract public ArrayList<Medlem> getMedlemmer();
    abstract public void tilfoejMedlemTilBog(Medlem medlem);
    abstract public void sletMedlemFraBog(int medlemsNr) throws MedlemNotFoundException;
    abstract public Medlem getMedlemById(int id);
}
