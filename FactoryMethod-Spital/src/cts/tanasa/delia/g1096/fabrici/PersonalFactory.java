package cts.tanasa.delia.g1096.fabrici;

import cts.tanasa.delia.g1096.clase.PersonalSpital;
import cts.tanasa.delia.g1096.enums.TipPersonal;

public interface PersonalFactory {
    PersonalSpital crearePersonal(TipPersonal tipPersonal, String nume, double salariu);
    PersonalSpital crearePersonal(TipPersonal tipPersonal, String nume, double salariu, int nrPacienti);

}
