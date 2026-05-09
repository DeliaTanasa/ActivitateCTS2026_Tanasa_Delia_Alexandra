package ro.ase.cts.main;

import ro.ase.cts.prototype.PrototypeReteta;
import ro.ase.cts.prototype.Reteta;

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
