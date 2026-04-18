package cts.tanasa.delia.g1096.prototype;

import java.util.Arrays;

public class FisaMedicala extends AFisaMedicala implements Cloneable{
    private String tipFisa;
    private String nume;
    private int[] CNP;

    public FisaMedicala(String tipFisa, String nume, int[] CNP) {
        this.tipFisa = tipFisa;
        this.nume = nume;
        this.CNP = Arrays.copyOf(CNP,CNP.length);
    }

    public void setTipFisa(String tipFisa) {
        this.tipFisa = tipFisa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCNP(int[] CNP) {
        this.CNP = CNP;
    }

    @Override
    public String toString() {
        return "FisaMedicala{" +
                "tipFisa='" + tipFisa + '\'' +
                ", nume='" + nume + '\'' +
                ", CNP=" + Arrays.toString(CNP) +
                '}';
    }

    private FisaMedicala(FisaMedicala fisaMedicala) {
        this.tipFisa=fisaMedicala.tipFisa;
        this.nume= fisaMedicala.nume;
        this.CNP= fisaMedicala.CNP;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new FisaMedicala(this);
    }
}
