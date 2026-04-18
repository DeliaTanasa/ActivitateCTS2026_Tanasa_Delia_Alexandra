package cts.tanasa.delia.g1096.singletonRegistry;

import java.util.HashMap;
import java.util.Map;

public class RegistruProduse{
    private static Map<String,ProdusGeneric> map=new HashMap<>();

    private RegistruProduse(){

    }

    public static ProdusGeneric getInstance(String nume, int stoc, ProdusGeneric produsGeneric){
        if(map.containsKey(nume)){
            map.get(nume).setStoc(map.get(nume).getStoc()+stoc);
        }
        else{
            map.put(nume,produsGeneric);
        }
        return map.get(nume);
    }


}
