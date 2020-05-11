package View;

import java.util.ArrayList;

/*
    Her er loginsiden
     */
// "Velkommen" - menu,  Prompt bruger til at vælge logintype (Formand, kasser, træner)
// 1. Formand - formandsMenu():list | visAlleMedlemmer(Arraylist<Medlem>)
//2. Kassérmenu() | seMedlemmerIRestance()  | registrerBetaling():boolean betalt/ikkebetalt
//3. træner TBD
public class MainView {
     String[] brugere = new String[]{bruger1, bruger2, bruger3};
        /*[
    {
        username: " Formand",
        password : "1234 "
    },
    {
        username: "Kassér",
        password: "4444"
    },
    {
        username: "træner",
        password: "5555"
    }
]
/*
         */
    String[] bruger1 = new String[]{"Traener", "5555"};
    String[] bruger2 = new String[]{"Kasser", "4444"};
    String[] bruger3 = new String[]{"Formand", "1234"};

    public void getInfo(String[] bruger) {
        String username = bruger[0];
        String password = bruger[1];
        var username = document.getElementById('username').value
        var password = document.getElementById('password').value

        for(var i = 0; i < objPeople.length; i++) {
            // check is user input matches username and password of a current index of the objPeople array
            if(username == objPeople[i].username && password == objPeople[i].password) {
                console.log(username + " is logged in!!!")
                // stop the function if this is found to be true
                return
            }
        }
        console.log("incorrect username or password")
    }
}
