package cts.tanasa.delia.g1096.singletonRegistry.Main;

import cts.tanasa.delia.g1096.singletonRegistry.CentruComanda;
import cts.tanasa.delia.g1096.singletonRegistry.CentruComandaRegistry;

public class Main {
    public static void main(String[] args) {
        CentruComandaRegistry.registry("Bucuresti",100,99,true);
        CentruComandaRegistry.registry("Oradea",100,3,false);
//        CentruComandaRegistry.registry("Bucuresti",101,99,false);

        CentruComanda c1= (CentruComanda) CentruComandaRegistry.getInstance("Bucuresti");
        CentruComanda c2= (CentruComanda) CentruComandaRegistry.getInstance("Bucuresti");
        CentruComanda c3= (CentruComanda) CentruComandaRegistry.getInstance("Oradea");
        System.out.println(c1==c2);
        System.out.println(c1==c3);
        c2.trimiteComanda();
        c3.veziStatus();



    }
}
