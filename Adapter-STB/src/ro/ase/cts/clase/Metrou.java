package ro.ase.cts.clase;

public class Metrou {
    private String tipAbonament;
    private String tipBilet;
    private double pretAbonamet;
    private double pretBilet;

    public Metrou(String tipAbonament, String tipBilet, double pretAbonamet, double pretBilet) {
        this.tipAbonament = tipAbonament;
        this.tipBilet = tipBilet;
        this.pretAbonamet = pretAbonamet;
        this.pretBilet = pretBilet;
    }

    public void scanarereBilet(){
        System.out.println("Biletul de tip "+this.tipBilet+" cu pretul de "+this.pretBilet+" a fost validat");
    }

    public void scanareAbonament(){
        System.out.println("Abonamentul de tip "+this.tipAbonament+" cu pretul de "+this.pretAbonamet+" a fost validat");
    }
}
