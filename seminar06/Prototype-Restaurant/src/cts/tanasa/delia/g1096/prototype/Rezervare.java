package cts.tanasa.delia.g1096.prototype;

public class Rezervare implements PrototypeRezervare, Cloneable{
    private String nume;
    private int nrPersoane;
    private String ora;

    public Rezervare(String nume, int nrPersoane, String ora) {
        if(nume.length()>=3) {
            this.nume = nume;
        }
        this.nrPersoane = nrPersoane;
        this.ora = ora;
    }

    private Rezervare() {
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Rezervare{" +
                "nume='" + nume + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", ora='" + ora + '\'' +
                '}');
    }

    public void setNrPersoane(int nrPersoane) {
        if(nrPersoane>=1) {
            this.nrPersoane = nrPersoane;
        }
    }

    @Override
    public PrototypeRezervare clone() throws CloneNotSupportedException {
        Rezervare clona=new Rezervare();
        clona.nume=this.nume;
        clona.nrPersoane=this.nrPersoane;
        clona.ora=this.ora;
        return clona;

    }
}
