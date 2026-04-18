package cts.tanasa.delia.g1096.clase;

public abstract class PersonalNonMedical implements PersonalSpital{
    private String nume;
    private double salariu;

    public PersonalNonMedical(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "PersonalNonMedical{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                '}';
    }
}
