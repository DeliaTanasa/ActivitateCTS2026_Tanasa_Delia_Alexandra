package cts.tanasa.delia.g1096.clase;

public abstract class PersonalMedical implements PersonalSpital{
    private String nume;
    private double salariu;
    private int nrPacienti;

    public PersonalMedical(String nume, double salariu, int nrPacienti) {
        this.nume = nume;
        this.salariu = salariu;
        this.nrPacienti = nrPacienti;
    }

    @Override
    public String toString() {
        return "PersonalMedical{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                ", nrPacienti=" + nrPacienti +
                '}';
    }
}
