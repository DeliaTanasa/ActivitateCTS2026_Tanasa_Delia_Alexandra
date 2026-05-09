package ro.ase.cts.clase;

public class Brancardier extends PersonalNonMedical{
    public Brancardier(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Brancardier "+super.toString());
    }
}
