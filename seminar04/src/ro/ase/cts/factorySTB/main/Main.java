package ro.ase.cts.factorySTB.main;

import ro.ase.cts.factorySTB.clasaFactory.MijlocTransportFactory;
import ro.ase.cts.factorySTB.clasaFactory.MijlocTransportFactorySingleton;
import ro.ase.cts.factorySTB.clasaFactory.MijlocTransportType;
import ro.ase.cts.factorySTB.vehicule.MijlocTransport;

public class Main {
    public static void afisareMijlocTransport(MijlocTransport mijlocTransport){
        mijlocTransport.afisareDescriere();
    }
    public static void main(String[] args) {

        MijlocTransportFactory factory=new MijlocTransportFactory();

        MijlocTransport autobuz= factory.getMijlocTransport("Mercedes",432, MijlocTransportType.AUTOBUZ);
        MijlocTransport tramvai= factory.getMijlocTransport("Astra",1, MijlocTransportType.TRAMVAI);
        MijlocTransport troleibuz= factory.getMijlocTransport("Mercedes",61, MijlocTransportType.TROLEIBUZ);

        afisareMijlocTransport(autobuz);
        afisareMijlocTransport(tramvai);
        afisareMijlocTransport(troleibuz);

        MijlocTransportFactorySingleton factorySingleton=MijlocTransportFactorySingleton.getInstance();

    }
}
