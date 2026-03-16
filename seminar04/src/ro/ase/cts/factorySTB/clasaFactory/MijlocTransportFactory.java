package ro.ase.cts.factorySTB.clasaFactory;

import ro.ase.cts.factorySTB.vehicule.Autobuz;
import ro.ase.cts.factorySTB.vehicule.MijlocTransport;

public class MijlocTransportFactory {


    public MijlocTransport getMijlocTransport(String marca, int linie,MijlocTransportType tip){
        if(tip==MijlocTransportType.AUTOBUZ)
            return new Autobuz(marca,linie);
        if(tip==MijlocTransportType.TRAMVAI)
            return new Autobuz(marca,linie);
        if(tip==MijlocTransportType.TROLEIBUZ)
            return new Autobuz(marca,linie);
        throw  new RuntimeException("Tip invalid");


    }
}
