package cts.tanasa.delia.g1096.factoryMethod.clase;

import java.util.Arrays;

public abstract class FisaMedicalaDoctor extends AFisaMedicala{
    private String nume;
    private int[] CNP;
    private String notiteConsult;

    public FisaMedicalaDoctor(String nume, int[] CNP, String notiteConsult) {
        this.nume = nume;
        this.CNP = CNP;
        this.notiteConsult = notiteConsult;
    }

    @Override
    public String toString() {
        return "FisaMedicalaDoctor{" +
                "nume='" + nume + '\'' +
                ", CNP=" + Arrays.toString(CNP) +
                ", notiteConsult='" + notiteConsult + '\'' +
                '}';
    }
}
