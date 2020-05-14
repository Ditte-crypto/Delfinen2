package Model;

public class ResultatNotFoundException extends Exception {
    public ResultatNotFoundException(){
        super("Resultat blev ikke fundet i resultatbogen");
    }
}
