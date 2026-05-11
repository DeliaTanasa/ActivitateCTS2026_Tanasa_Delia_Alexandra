package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaInternari {
    private Map<String,IPacient> internari=new HashMap<>();

    public IPacient getInternare(String cnp, String nume, String nrTelefon, String adresa){
        if(internari.containsKey(cnp)){
            return internari.get(cnp);
        }
        else{
            IPacient pacient=new Pacient(cnp,nume,nrTelefon,adresa);
            internari.put(cnp,pacient);
            return pacient;

        }
    }

}
