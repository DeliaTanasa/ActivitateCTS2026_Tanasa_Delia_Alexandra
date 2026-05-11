package ro.ase.cts.decorator;

import ro.ase.cts.clase.Rezultate;

public class RezultatePlatformaOnline extends RezultateDecorator{
    public RezultatePlatformaOnline(Rezultate rezultate) {
        super(rezultate);
    }

    @Override
    public void trimitereRezultate() {
        super.trimitereRezultate();
        System.out.println("Acum aveti posibilitatea vizualizarii rezultatelor si online");
    }

    @Override
    public void trimitereRezultateOnline() {
        System.out.println("Rezultatele dumneavoastra sunt disponibile pe platforma online");
    }
}
