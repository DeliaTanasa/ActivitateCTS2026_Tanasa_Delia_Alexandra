package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaRezervari {
    private Map<String,IRezervare> rezervareClient=new HashMap<>();


    public IRezervare getRezervare(String nume, String nrTelefon, String adresaEmail){
        if(rezervareClient.containsKey(nume)){
            return rezervareClient.get(nume);
        }
        else{
            IRezervare rezervare=new RezervareClient(nume,nrTelefon,adresaEmail);
            rezervareClient.put(nume,rezervare);
            return rezervare;
        }

    }
}
