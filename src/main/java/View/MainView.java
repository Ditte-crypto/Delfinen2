package View;

import Model.Cashier;
import Model.Formand;
import Model.Trainer;
import Model.User;

import java.util.ArrayList;
import java.util.Scanner;

/*
    Her er loginsiden
     */
// "Velkommen" - menu,  Prompt bruger til at vælge logintype (Formand, kasser, træner)
// 1. Formand - formandsMenu():list | visAlleMedlemmer(Arraylist<Medlem>)
//2. Kassérmenu() | seMedlemmerIRestance()  | registrerBetaling():boolean betalt/ikkebetalt
//3. træner TBD
public class MainView {


    public User getInfo() {
        ArrayList<User> users = new ArrayList<>();

        User bruger1 = new Trainer("Traener", "5555", "træner");
        User bruger2 = new Cashier("Kasser", "4444", "kasser");
        User bruger3 = new Formand("Formand", "1234", "formand");
        users.add(bruger1);
        users.add(bruger2);
        users.add(bruger3);

        String username = "";
        String password = "";
        Boolean login = false;
        Scanner sc = new Scanner(System.in);
        User loggedInUser = null;
        while (!login) {
            System.out.println("Brugernavn: ");
            username = sc.nextLine();
            System.out.println("Kodeord: ");
            password = sc.nextLine();
            for (User u : users) {
                if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                    System.out.println("du er logget ind");
                    loggedInUser = u;
                    login = true;
                    return loggedInUser;
                }
            }
            System.out.println("Forkert brugernavn eller kodeord.");
        }
        return loggedInUser;
    }
}
