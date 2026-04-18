package cts.tanasa.delia.g1096.singletonRegistry;

import cts.tanasa.delia.g1096.singletonRegistry.ProdusGeneric;

public class ProdusElectronic implements ProdusGeneric {
    private String nume;
    private int stoc;
    private int volti;

    public ProdusElectronic(String nume, int stoc, int volti) {
        this.nume = nume;
        this.stoc = stoc;
        this.volti = volti;
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
