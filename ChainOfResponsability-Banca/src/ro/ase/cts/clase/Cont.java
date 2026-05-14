package ro.ase.cts.clase;

public abstract class Cont {
    private Cont contUrmator;
    private double sold;
    private String numeCont;

    public Cont(double sold, String numeCont) {
        this.sold = sold;
        this.numeCont = numeCont;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public String getNumeCont() {
        return numeCont;
    }

    public void setNumeCont(String numeCont) {
        this.numeCont = numeCont;
    }

    public Cont getContUrmator() {
        return contUrmator;
    }

    public void setContUrmator(Cont contUrmator) {
        this.contUrmator = contUrmator;
    }

    public abstract void realizarePlata(double suma);
}
