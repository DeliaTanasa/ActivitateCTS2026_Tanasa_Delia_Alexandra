package cts.tanasa.delia.g1096.prototypeCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrototypeCollection {
    private final Map<String,Account> map=new HashMap<>();

    public PrototypeCollection(){
        List<Double> listaTranzactii=new ArrayList<>();
        listaTranzactii.add(800.0);
        listaTranzactii.add(700.0);
        listaTranzactii.add(90.0);
        map.put("Personal",new SavingsAccount(9000,"Ana",listaTranzactii,0,0.02));
        map.put("Annual",new SavingsAccount(9000,"Ana",listaTranzactii,1,0.05));
    }

    public Account getAccount(String cheie) throws CloneNotSupportedException {
        return (Account) ((SavingsAccount) map.get(cheie)).clone();
    }
}
