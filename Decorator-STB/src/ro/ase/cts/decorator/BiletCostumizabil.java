package ro.ase.cts.decorator;

import ro.ase.cts.clase.Bilet;

public class BiletCostumizabil extends BiletDecorator{
    public BiletCostumizabil(Bilet bilet) {
        super(bilet);
    }

    @Override
    public void printareBilet() {
        super.printareBilet();
        System.out.println("Puteti adauga mesajul ,,La multi ani,, pe bilet");
    }

    @Override
    public void printareBiletCostumizabil() {
        System.out.println("Se printeaza biletul dumneavoastra costumizabil cu mesajul ,,La multi ani!,, ");
    }
}
