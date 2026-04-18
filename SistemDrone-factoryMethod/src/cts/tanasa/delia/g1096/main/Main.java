package cts.tanasa.delia.g1096.main;

import cts.tanasa.delia.g1096.factoryMethod.*;

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
