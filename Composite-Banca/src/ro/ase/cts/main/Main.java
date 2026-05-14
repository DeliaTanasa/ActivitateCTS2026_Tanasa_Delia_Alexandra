package ro.ase.cts.main;

import ro.ase.cts.clase.AgentieBanca;
import ro.ase.cts.clase.FilialaBanca;
import ro.ase.cts.clase.SucursalaBanca;

public class Main {
    public static void main(String[] args) {
        SucursalaBanca agentie=new AgentieBanca("Agentie judeteana");
        SucursalaBanca agentie1=new AgentieBanca("Agentie BancaING");
        SucursalaBanca agentie2=new AgentieBanca("Agentie Banca Transilvania");
        SucursalaBanca filiala1=new FilialaBanca("Filiala Falticeni");
        SucursalaBanca filiala2=new FilialaBanca("Filiala Targu Frumos");
        SucursalaBanca filiala3=new FilialaBanca("Filiala Ploiesti");
        SucursalaBanca filiala4=new FilialaBanca("Filiala Suceava");

        agentie.adaugareNod(agentie1);
        agentie.adaugareNod(agentie2);
        agentie1.adaugareNod(filiala1);
        agentie1.adaugareNod(filiala2);
        agentie1.adaugareNod(filiala3);
        agentie2.adaugareNod(filiala4);
        agentie.descriere();
    }
}
