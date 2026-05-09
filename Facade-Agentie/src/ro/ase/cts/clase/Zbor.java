package ro.ase.cts.clase;

public class Zbor {
    private String orasPlecare;
    private String orasDestinatie;
    private String tipBilet;

    public Zbor(String orasPlecare, String prasDestinatie, String tipBilet) {
        this.orasPlecare = orasPlecare;
        this.orasDestinatie = prasDestinatie;
        this.tipBilet = tipBilet;
    }

    public void rezervaZborDus(){
        System.out.println("S a rezervat un bilet dus de pe "+this.orasPlecare+" spre "+this.orasDestinatie +" de tipul "+this.tipBilet);
    }

    public void rezervaZborIntors(){
        System.out.println("S a rezervat un bilet intors de pe "+this.orasPlecare+" spre "+this.orasDestinatie +" de tipul "+this.tipBilet);
    }
}
