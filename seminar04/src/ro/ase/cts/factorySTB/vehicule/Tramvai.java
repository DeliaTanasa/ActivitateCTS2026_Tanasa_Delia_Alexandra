package ro.ase.cts.factorySTB.vehicule;

public class Tramvai extends MijlocTransport{
    public Tramvai(String marca, int linia) {
        super(marca, linia);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Tramvaiul "+super.toString());
    }
}
