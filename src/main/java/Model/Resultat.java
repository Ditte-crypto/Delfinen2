package Model;

public class Resultat {
/*
create table resultat(
MedlemsID int not null,
resultatid int not null,
Staevne varchar (255) default null,
tid int not null,
distance ENUM ('50', '100', '200', '400', '800', '1500') default null,
Disciplin ENUM ('butterfly', 'crawl', 'rygcrawl', 'brystsvømning') default null,
foreign key (MedlemsId) references konkurrencesvoemmer(medlemsid),
primary key (resultatid)
)engine=InnoDB default charset=utf8;
 */
Medlem medlem;
int resultatid;
String staevne;
int tid;
Distance distance;
Disciplin disciplin;

    public Resultat(Medlem medlem, String staevne, int tid, Distance distance, Disciplin disciplin) {
        this.medlem = medlem;
        this.staevne = staevne;
        this.tid = tid;
        this.distance = distance;
        this.disciplin = disciplin;
    }

    public Resultat(){

    }

    @Override
    public String toString() {
        return "Resultat{" +
                "medlem=" + medlem +
                ", resultatid=" + resultatid +
                ", staevne='" + staevne + '\'' +
                ", tid=" + tid +
                ", distance=" + distance +
                ", disciplin=" + disciplin +
                '}';
    }

    public int getMedlemsIDFromResultat(){
        int retInt = 0;
        Medlem medlem = getMedlem();
        retInt = medlem.getId();
        return retInt;
    }

    public int getResultatid() {
        return resultatid;
    }

    public void setResultatid(int resultatid) {
        this.resultatid = resultatid;
    }

    public Medlem getMedlem() {
        return medlem;
    }

    public void setMedlem(Medlem medlem) {
        this.medlem = medlem;
    }

    public String getStaevne() {
        return staevne;
    }

    public void setStaevne(String staevne) {
        this.staevne = staevne;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public Disciplin getDisciplin() {
        return disciplin;
    }

    public void setDisciplin(Disciplin disciplin) {
        this.disciplin = disciplin;
    }
}
