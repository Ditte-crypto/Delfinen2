package Model;


/*
create table medlemmer (
MedlemsID int not null auto_increment,
Navn varchar(255) default null,
Aargang int not null,
Betalt boolean,
Aktiv boolean,
primary key(MedlemsID)
)engine=InnoDB default charset=utf8;
 */

import java.time.LocalDate;
import Util.Globals;

import javax.swing.*;

public class Medlem {
    int id;
    String navn;
    int aargang;
    Boolean betalt;
    Boolean aktiv;

    public Medlem(){

    }

    public Medlem(int id, String navn, int aargang, Boolean betalt, Boolean aktiv) {
        this.id = id;
        this.navn = navn;
        this.aargang = aargang;
        this.betalt = betalt;
        this.aktiv = aktiv;
    }
    public Medlem(String navn, int aargang, Boolean betalt, Boolean aktiv) {
        this.navn = navn;
        this.aargang = aargang;
        this.betalt = betalt;
        this.aktiv = aktiv;
    }

    @Override
    public String toString() {
        return  "\nMedlemsID: " + id +
                "\nNavn: " + navn +
                "\nAargang: " + aargang +
                "\nBetalt: " + betalt +
                "\nAktiv: " + aktiv;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAargang(int aargang) {
        this.aargang = aargang;
    }

    public void setBetalt(Boolean betalt) {
        this.betalt = betalt;
    }

    public void setAktiv(Boolean aktiv) {
        this.aktiv = aktiv;
    }

    public int getId() {
        return id;
    }

    public String getNavn() {
        return navn;
    }

    public int getAargang() {
        return aargang;
    }

    public Boolean getBetalt() {
        return betalt;
    }

    public Boolean getAktiv() {
        return aktiv;
    }

    public int calcFee() {
        int now = LocalDate.now().getYear();
        int age = now - aargang;
        int payMent = Globals.seniorRate;
        if (!aktiv) {
            payMent = Globals.passiveRate;
            return payMent;
        } else {
            if (age < 18) {
                payMent = Globals.juniorRate;
            } else if (age > 60 ) {
                payMent = (int) (payMent - (payMent* (Globals.pensioneerRatePercentage)/100.0));
            }
        }
        return payMent;
    }
}
