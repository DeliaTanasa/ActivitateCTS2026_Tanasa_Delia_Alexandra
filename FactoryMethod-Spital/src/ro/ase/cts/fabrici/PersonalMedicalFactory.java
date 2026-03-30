package ro.ase.cts.fabrici;

import ro.ase.cts.clase.Asistent;
import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.enums.TipPersonal;
import ro.ase.cts.enums.TipPersonalMedical;

public class PersonalMedicalFactory implements PersonalFactory{

    @Override
    public PersonalSpital crearePersonal(TipPersonal tipPersonal, String nume, double salariu) {
        return crearePersonal(tipPersonal,nume,salariu,5);
    }

    @Override
    public PersonalSpital crearePersonal(TipPersonal tipPersonal, String nume, double salariu, int nrPacienti) {
        return switch (tipPersonal){
            case TipPersonalMedical.MEDIC -> new Medic(nume,salariu,nrPacienti);
            case TipPersonalMedical.ASISTENT -> new Asistent(nume,salariu,nrPacienti);
            default -> null;
        };
    }
}
