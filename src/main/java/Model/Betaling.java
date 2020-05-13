package Model;

public class Betaling {
    int id;
    int medlemsid;
    int year;
    int amount;

    public Betaling(int id, int medlemsid, int year, int amount) {
        this.id = id;
        this.medlemsid = medlemsid;
        this.year = year;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMedlemsid() {
        return medlemsid;
    }

    public void setMedlemsid(int medlemsid) {
        this.medlemsid = medlemsid;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Betaling{" +
                "id=" + id +
                ", medlemsid=" + medlemsid +
                ", year=" + year +
                ", amount=" + amount +
                '}';
    }
}
