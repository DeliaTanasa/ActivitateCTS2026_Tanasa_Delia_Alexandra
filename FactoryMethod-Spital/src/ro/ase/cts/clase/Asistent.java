package ro.ase.cts.clase;

public class Asistent extends PersonalMedical{
    public Asistent(String nume, double salariu, int nrPacienti) {
        super(nume, salariu, nrPacienti);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Asistent "+super.toString());
    }
}
