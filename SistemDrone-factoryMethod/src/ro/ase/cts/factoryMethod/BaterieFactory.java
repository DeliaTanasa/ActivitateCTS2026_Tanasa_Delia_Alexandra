package ro.ase.cts.factoryMethod;

public class BaterieFactory implements AbstractModuleFactory{
    @Override
    public AbstractModule creareModul() {
        return new ModulBaterie("amg","fastcharghing",200,500,50);
    }
}
