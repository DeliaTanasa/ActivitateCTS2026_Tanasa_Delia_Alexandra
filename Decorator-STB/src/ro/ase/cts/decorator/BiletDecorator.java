package ro.ase.cts.decorator;

import ro.ase.cts.clase.Bilet;

public abstract class BiletDecorator implements Bilet {
    private Bilet bilet;

    public BiletDecorator(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printareBilet() {
        bilet.printareBilet();
    }

    public abstract void printareBiletCostumizabil();
}
