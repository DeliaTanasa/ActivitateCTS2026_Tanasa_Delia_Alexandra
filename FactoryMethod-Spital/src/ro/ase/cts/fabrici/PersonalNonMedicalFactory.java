package ro.ase.cts.fabrici;

import ro.ase.cts.clase.Brancardier;
import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.clase.Registrator;
import ro.ase.cts.clase.Secretar;
import ro.ase.cts.enums.TipPersonal;
import ro.ase.cts.enums.TipPersonalNonMedical;

public class PersonalNonMedicalFactory implements PersonalFactory{


    @Override
    public PersonalSpital crearePersonal(TipPersonal tipPersonal, String nume, double salariu) {
        return switch (tipPersonal){
            case TipPersonalNonMedical.BRANCARDIER -> new Brancardier(nume,salariu);
            case TipPersonalNonMedical.REGISTRATOR -> new Registrator(nume,salariu);
            case TipPersonalNonMedical.SECRETAR -> new Secretar(nume,salariu);
            default -> null;
        };
    }

    @Override
    public PersonalSpital crearePersonal(TipPersonal tipPersonal, String nume, double salariu, int nrPacienti) {
        return crearePersonal(tipPersonal,nume,salariu);
    }
}
