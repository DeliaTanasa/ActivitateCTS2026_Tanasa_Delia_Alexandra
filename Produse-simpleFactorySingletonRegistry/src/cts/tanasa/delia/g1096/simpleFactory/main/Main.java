package cts.tanasa.delia.g1096.simpleFactory.main;

import cts.tanasa.delia.g1096.simpleFactory.ProdusFactory;
import cts.tanasa.delia.g1096.simpleFactory.ProdusGeneric;

public class Main {
    public static void main(String[] args) throws Exception {
        ProdusGeneric bio=ProdusFactory.creareProdus("bio","banana",20,"20.03.2029");
        ProdusGeneric electronic=ProdusFactory.creareProdus("electronic","laptop",2900,"01.01.9999");
        ProdusGeneric perisabil=ProdusFactory.creareProdus("perisabil","paine",4,"12.03.2020");
//        ProdusGeneric perisabil2=ProdusFactory.creareProdus("ceva","lapte",13,"23.09.2029");


        bio.afiseazaDetalii();
        electronic.afiseazaDetalii();
        perisabil.afiseazaDetalii();
//      //perisabil2.afiseazaDetalii();

    }
}
