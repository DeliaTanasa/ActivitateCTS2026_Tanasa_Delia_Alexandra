package cts.tanasa.delia.g1096.main;

import cts.tanasa.delia.g1096.prototype.PrototypeReteta;
import cts.tanasa.delia.g1096.prototype.Reteta;

public class Main {
    public static void main(String[] args) {
        PrototypeReteta reteta1=new Reteta("Paracetamol",5,250);
        PrototypeReteta reteta2=reteta1.cloneaza();
        System.out.println(reteta2);

        ((Reteta) reteta1).setCantitatiSolutii(900);
        System.out.println(reteta1);
        reteta2=reteta1.cloneaza();
        System.out.println(reteta2);

    }
}
