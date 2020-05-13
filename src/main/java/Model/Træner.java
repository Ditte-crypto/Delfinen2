package Model;

import java.util.Scanner;

public class Træner {


    public int TrænerMenu() {

        int retInt = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Velkommen Træner!" +
                "[1] : for at vise svømmetider" +
                "[2] : tilføj stævneresultater" +
                "[3] : tilføj træningsresultater" +
                "[99] : forlad programmet");
        retInt = in.nextInt();
        return retInt;
    }
}
