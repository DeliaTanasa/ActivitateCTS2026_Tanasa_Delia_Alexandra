package cts.tanasa.delia.g1096.factoryMethod.clase;

import java.util.Arrays;

public abstract class FisaMedicalaPacient extends AFisaMedicala{
    String nume;
    int[] CNP;

    public FisaMedicalaPacient(String nume, int[] CNP) {
        this.nume = nume;
        this.CNP = CNP;
    }

    @Override
    public String toString() {
        return "FisaMedicalaPacient{" +
                "nume='" + nume + '\'' +
                ", CNP=" + Arrays.toString(CNP) +
                '}';
    }
}
