package cts.tanasa.delia.g1096.singletonRegistry;

import cts.tanasa.delia.g1096.singletonRegistry.ProdusGeneric;

public class ProdusPerisabil implements ProdusGeneric {
    private String nume;
    private int stoc;
    private String dataExpirare;

    public ProdusPerisabil(String nume, int stoc, String dataExpirare) {
        this.nume = nume;
        this.stoc = stoc;
        this.dataExpirare = dataExpirare;
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
