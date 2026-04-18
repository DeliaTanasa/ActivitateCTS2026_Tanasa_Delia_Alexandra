package cts.tanasa.delia.g1096.factoryMethod;

public class CameraFactory implements AbstractModuleFactory{
    @Override
    public AbstractModule creareModul() {
        return new ModulCamera("canon","doua obiective",3000,1000,2025);
    }
}
