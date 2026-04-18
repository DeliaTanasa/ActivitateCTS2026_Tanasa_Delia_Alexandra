package cts.tanasa.delia.g1096.factoryMethod;

public class BaterieFactory implements AbstractModuleFactory{
    @Override
    public AbstractModule creareModul() {
        return new ModulBaterie("amg","fastcharghing",200,500,50);
    }
}
