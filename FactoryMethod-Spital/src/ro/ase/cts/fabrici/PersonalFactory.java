package ro.ase.cts.fabrici;

import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.enums.TipPersonal;

public interface PersonalFactory {
    PersonalSpital crearePersonal(TipPersonal tipPersonal, String nume, double salariu);
    PersonalSpital crearePersonal(TipPersonal tipPersonal, String nume, double salariu, int nrPacienti);

}
