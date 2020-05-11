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
}
