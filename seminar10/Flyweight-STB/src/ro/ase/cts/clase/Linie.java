package ro.ase.cts.clase;

public class Linie implements LinieDeTransport{
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    protected Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void afiseazaAutobuzLinie(Autobuz autobuz) {
        System.out.println("Autobuzul "+this.nrLinie+" porneste din statia "+this.primaStatie+", iar statia finala este "+this.ultimaStatie+".");
    }

    @Override
    public void afiseazaNrMaximCalatoriTraseu(Autobuz autobuz) {
        System.out.println("De la statia "+this.primaStatie+" pana la statia "+this.ultimaStatie+" pot merge maxim "+autobuz.getNrLocuri());
    }
}
