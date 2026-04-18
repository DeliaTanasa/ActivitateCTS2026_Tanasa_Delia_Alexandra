package cts.tanasa.delia.g1096.singletonRegistry;

import cts.tanasa.delia.g1096.singletonRegistry.ProdusGeneric;

public class ProdusBio implements ProdusGeneric {
    private String nume;
    private int stoc;
    private String taraProvenienta;

    public ProdusBio(String nume, int stoc, String taraProvenienta) {
        this.nume = nume;
        this.stoc = stoc;
        this.taraProvenienta = taraProvenienta;
    }

    @Override
    public String getNumeProdus() {
        return this.nume;
    }

    @Override
    public int getStoc() {
        return this.stoc;
    }

    @Override
    public void setStoc(int stoc) {
        this.stoc=stoc;
    }
}
