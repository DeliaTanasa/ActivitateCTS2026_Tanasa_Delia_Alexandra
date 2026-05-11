package ro.ase.cts.decorator;

import ro.ase.cts.clase.Rezultate;

public abstract class RezultateDecorator implements Rezultate {
    private Rezultate rezultate;

    public RezultateDecorator(Rezultate rezultate) {
        this.rezultate = rezultate;
    }

    @Override
    public void trimitereRezultate() {
        rezultate.trimitereRezultate();
    }

    public abstract void trimitereRezultateOnline();
}
