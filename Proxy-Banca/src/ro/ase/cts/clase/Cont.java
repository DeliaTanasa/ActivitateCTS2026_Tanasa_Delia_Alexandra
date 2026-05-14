package ro.ase.cts.clase;

public class Cont {
    private int nrCont;
    private String tipMoneda;

    public Cont(int nrCont, String tipMoneda) {
        this.nrCont = nrCont;
        this.tipMoneda = tipMoneda;
    }

    public int getNrCont() {
        return nrCont;
    }

    public void setNrCont(int nrCont) {
        this.nrCont = nrCont;
    }

    public String getTipMoneda() {
        return tipMoneda;
    }

    public void setTipMoneda(String tipMoneda) {
        this.tipMoneda = tipMoneda;
    }
}
