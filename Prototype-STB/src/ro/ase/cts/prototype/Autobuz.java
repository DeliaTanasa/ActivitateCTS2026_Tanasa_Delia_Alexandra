package ro.ase.cts.prototype;

public class Autobuz implements IMijlocTransport{
    private String marca;
    private int nrLocuri;
    private int nrSoferiAlocati;

    public Autobuz(String marca, int nrLocuri, int nrSoferiAlocati) {
        this.marca = marca;
        if(nrLocuri<60){
            this.nrLocuri = nrLocuri;
        }
        if(nrSoferiAlocati<=5){
            this.nrSoferiAlocati = nrSoferiAlocati;
        }

    }

    private Autobuz() {
    }

    public void setNrLocuri(int nrLocuri) {
        if(nrLocuri<60){
            this.nrLocuri = nrLocuri;
        }
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public IMijlocTransport cloneaza() {
        Autobuz clona=new Autobuz();
        clona.marca=this.marca;
        clona.nrLocuri=this.nrLocuri;
        clona.nrSoferiAlocati=this.nrSoferiAlocati;
        return clona;

    }

    @Override
    public void afisareDetalii() {
        System.out.println("Autobuz{" +
                "marca='" + marca + '\'' +
                ", nrLocuri=" + nrLocuri +
                ", nrSoferiAlocati=" + nrSoferiAlocati +
                '}');
    }
}
