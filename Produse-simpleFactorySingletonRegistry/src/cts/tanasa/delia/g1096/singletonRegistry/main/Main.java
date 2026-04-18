package cts.tanasa.delia.g1096.singletonRegistry.main;

import cts.tanasa.delia.g1096.singletonRegistry.ProdusBio;
import cts.tanasa.delia.g1096.singletonRegistry.ProdusElectronic;
import cts.tanasa.delia.g1096.singletonRegistry.ProdusGeneric;
import cts.tanasa.delia.g1096.singletonRegistry.RegistruProduse;

public class Main {
    public static void main(String[] args) {
        ProdusBio produsBio=new ProdusBio("Mar",10,"Romania");
        ProdusBio produsBio1=new ProdusBio("Mar",10,"Romania");
        ProdusElectronic produsElectronic=new ProdusElectronic("Telefon",2,100);
        ProdusGeneric mar= RegistruProduse.getInstance("mar",20,produsBio);
        System.out.println(mar.getNumeProdus()+" "+mar.getStoc());
        ProdusGeneric mar1= RegistruProduse.getInstance("mar",5,produsBio1);

        System.out.println(mar1.getNumeProdus()+" "+mar1.getStoc());

    }
}
