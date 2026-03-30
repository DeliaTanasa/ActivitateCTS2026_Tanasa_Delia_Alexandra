package ro.ase.cts.clase;

public class Registrator extends PersonalNonMedical{
    public Registrator(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Registrator "+super.toString());
    }
}
