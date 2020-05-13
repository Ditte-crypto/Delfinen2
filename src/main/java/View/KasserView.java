package View;

import Model.KasserBog;
import Model.Medlem;
import Model.MedlemsBog;

import java.util.ArrayList;
import java.util.Scanner;

public class KasserView {
    public int kasserMenu(){
        int retInt = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Velkommen Kasser!\n"+
                "[1] : Se medlemmer i restance\n"+
                "[2] : Registrer betaling\n"+
                "[3] : Sæt medlem i restance\n"+
                "[99] : forlad programmet\n");
        retInt = in.nextInt();
        return retInt;
    }
    public void visMedlemmerIRestance(KasserBog kasserBog){
        ArrayList<Medlem> medlemmerIRestance = kasserBog.getMedlemmer();
        for(Medlem m : medlemmerIRestance){
            System.out.println(m);
        }
    }
    public int idPaaMedlemDerHarBetalt(KasserBog kasserBog){
        int retInt = 0;
        Scanner in = new Scanner(System.in);
        visMedlemmerIRestance(kasserBog);
        System.out.println("Tast id på medlem, der har betalt");
        retInt = in.nextInt();
        return retInt;
    }
    public int idPaaMedlemDerErIRestance(MedlemsBog medlemsBog){
        int retInt = 0;
        Scanner in = new Scanner(System.in);
        medlemsBog.getMedlemmer();
        System.out.println("Tast id på medlem, der er i restance");
        retInt = in.nextInt();
        return retInt;
    }
}
