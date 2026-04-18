package cts.tanasa.delia.g1096.clase;

public class Medic extends PersonalMedical{
    public Medic(String nume, double salariu, int nrPacienti) {
        super(nume, salariu, nrPacienti);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Medic "+super.toString());
    }
}
