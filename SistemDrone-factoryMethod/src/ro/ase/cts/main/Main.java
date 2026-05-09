package ro.ase.cts.main;

import cts.tanasa.delia.g1096.factoryMethod.*;
import ro.ase.cts.factoryMethod.AbstractModule;
import ro.ase.cts.factoryMethod.AbstractModuleFactory;
import ro.ase.cts.factoryMethod.BaterieFactory;
import ro.ase.cts.factoryMethod.ModulBaterie;

public class Main {
    public static void main(String[] args) {
        AbstractModuleFactory baterieFactory=new BaterieFactory();
        AbstractModule baterie=baterieFactory.creareModul();
        System.out.println(baterie);
        ModulBaterie bateriePersonalizata= (ModulBaterie) baterieFactory.creareModul();
        bateriePersonalizata.setDimensiune(999);
        System.out.println(bateriePersonalizata);

    }
}
