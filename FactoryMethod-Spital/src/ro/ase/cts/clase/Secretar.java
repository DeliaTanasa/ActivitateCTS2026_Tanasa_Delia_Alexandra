package ro.ase.cts.clase;

public class Secretar extends PersonalNonMedical{
    public Secretar(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Secretar "+super.toString());
    }
}
