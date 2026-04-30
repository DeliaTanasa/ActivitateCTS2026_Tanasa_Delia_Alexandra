package ro.ase.cts.clase;

public class Autobuz implements LinieDeTransport{
    private String model;
    private int anFabricatie;
    private int nrLocuri;

    public Autobuz(String model, int anFabricatie, int nrLocuri) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }


    public int getNrLocuri() {
        return nrLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", nrLocuri=" + nrLocuri +
                '}';
    }

    @Override
    public void afiseazaAutobuzLinie(Autobuz autobuz) {

    }

    @Override
    public void afiseazaNrMaximCalatoriTraseu(Autobuz autobuz) {

    }
}
