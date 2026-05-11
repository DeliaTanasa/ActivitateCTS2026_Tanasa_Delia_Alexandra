package ro.ase.cts.clase;

public class InformatiiInternare {
    private String dataSpitalizare;
    private int nrsalon;
    private int nrPat;
    private int zileSpitalizare;

    public InformatiiInternare(String dataSpitalizare, int nrsalon, int nrPat, int zileSpitalizare) {
        this.dataSpitalizare = dataSpitalizare;
        this.nrsalon = nrsalon;
        this.nrPat = nrPat;
        this.zileSpitalizare = zileSpitalizare;
    }

    public String getDataSpitalizare() {
        return dataSpitalizare;
    }

    public void setDataSpitalizare(String dataSpitalizare) {
        this.dataSpitalizare = dataSpitalizare;
    }

    public int getNrsalon() {
        return nrsalon;
    }

    public void setNrsalon(int nrsalon) {
        this.nrsalon = nrsalon;
    }

    public int getNrPat() {
        return nrPat;
    }

    public void setNrPat(int nrPat) {
        this.nrPat = nrPat;
    }

    public int getZileSpitalizare() {
        return zileSpitalizare;
    }

    public void setZileSpitalizare(int zileSpitalizare) {
        this.zileSpitalizare = zileSpitalizare;
    }
}
