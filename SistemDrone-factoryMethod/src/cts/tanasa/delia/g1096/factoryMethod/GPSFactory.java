package cts.tanasa.delia.g1096.factoryMethod;

public class GPSFactory implements AbstractModuleFactory{
    @Override
    public AbstractModule creareModul() {
        return new ModulGPS("digital","te duci unde vrei",1000,4,99);
    }
}
