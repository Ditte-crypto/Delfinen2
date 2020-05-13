package Model;

import View.CashierView;

import java.util.ArrayList;

public class Cashier extends User {
    CashierView view;

    public Cashier(String name, String password,  String role) {
        super(name,password,role);
        this.view = new CashierView();
    }

    @Override
    public void showMenu() {
        view.mainMenu();
        int menuValg = 0;
        while (menuValg!= 99) {
            sc.nextInt();
            switch (menuValg) {
                case 1:
                    medlemsBog.visAlleMedlemmer();
                    break;
                case 2:
                    // view.showPaymentsDue(medlemsBog;
                    medlemsBog.showMembersDuePayment();
                case 3:
                    // view.makePayment(medlemsBog);
                    break;
                case 99:
            }
        }
    }

}
