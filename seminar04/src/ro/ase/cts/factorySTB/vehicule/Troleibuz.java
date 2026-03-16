package ro.ase.cts.factorySTB.vehicule;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(String marca, int linia) {
        super(marca, linia);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Troleibuzul "+super.toString());
    }
}
