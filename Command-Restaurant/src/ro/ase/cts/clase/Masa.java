package ro.ase.cts.clase;

public class Masa implements Restaurant{
    private int nrMasa;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
    }


    @Override
    public void rezervaMasa() {
        System.out.println("Masa cu numarul "+this.nrMasa+" a fost rezervata");
    }

    @Override
    public void ocupaMasa() {
        System.out.println("Masa cu numarul "+this.nrMasa+" a fost ocupata");
    }
}
