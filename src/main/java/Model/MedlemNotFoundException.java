package Model;

public class MedlemNotFoundException extends Exception {
    public MedlemNotFoundException(){
        super("Medlem blev ikke fundet i listen.");
    }
}
