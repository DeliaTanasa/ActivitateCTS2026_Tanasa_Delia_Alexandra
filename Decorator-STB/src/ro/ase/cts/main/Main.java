package ro.ase.cts.main;

import ro.ase.cts.clase.Bilet;
import ro.ase.cts.clase.BiletStandard;
import ro.ase.cts.decorator.BiletCostumizabil;
import ro.ase.cts.decorator.BiletDecorator;

public class Main {
    public static void main(String[] args) {
        Bilet bilet1=new BiletStandard();
        bilet1.printareBilet();

        BiletDecorator bilet2=new BiletCostumizabil(bilet1);
        bilet2.printareBilet();
        bilet2.printareBiletCostumizabil();
    }
}
