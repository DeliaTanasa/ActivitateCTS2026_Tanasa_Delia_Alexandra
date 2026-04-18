package cts.tanasa.delia.g1096.singletonRegistry;

import java.util.HashMap;
import java.util.Map;

public class CentruComandaRegistry {
    private CentruComandaRegistry() {
    }

    private static Map<String,ICentru> map=new HashMap<>();

//    public static void registry(String cheie,int nrVehicule, String numeOras, int nrComanda, boolean trimisa){
//        if(map.containsKey(cheie)){
//            throw new RuntimeException("Exista deja centru de comanda in acest oras");
//        }
//        else{
//            map.put(cheie,new CentruComanda(nrVehicule,numeOras,nrComanda,trimisa));
//        }
//    }

    public static void registry(String cheie,int nrVehicule, int nrComanda, boolean trimisa){
        if(map.containsKey(cheie)){
            throw new RuntimeException("Exista deja centru de comanda in acest oras");
        }
        else{
            map.put(cheie,new CentruComanda(nrVehicule,cheie,nrComanda,trimisa));
        }
    }

    public static ICentru getInstance(String cheie){
        return map.get(cheie);
    }
}
