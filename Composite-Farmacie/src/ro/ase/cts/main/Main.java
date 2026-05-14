package ro.ase.cts.main;

import ro.ase.cts.clase.Medicament;
import ro.ase.cts.clase.OrganizareMedicament;
import ro.ase.cts.clase.TipMedicament;

public class Main {
    public static void main(String[] args) {
        TipMedicament sectiune=new TipMedicament("Prima sectiune");
        TipMedicament tipMedicament=new TipMedicament("De durere");
        TipMedicament tipMedicament1=new TipMedicament("De raceala");

        OrganizareMedicament medicament=new Medicament("Nurofen raceala si gripa");
        OrganizareMedicament medicament1=new Medicament("Nurofen");


        tipMedicament1.adaugaNod(medicament1);
        tipMedicament.adaugaNod(medicament);
        sectiune.adaugaNod(tipMedicament1);
        sectiune.adaugaNod(tipMedicament);
        sectiune.detaliiMedicament();


    }
}
