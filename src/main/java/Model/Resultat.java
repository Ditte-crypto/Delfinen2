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
}
