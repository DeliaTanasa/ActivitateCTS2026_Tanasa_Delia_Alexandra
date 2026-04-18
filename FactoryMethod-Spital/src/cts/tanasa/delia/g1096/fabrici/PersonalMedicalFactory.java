package cts.tanasa.delia.g1096.fabrici;

import cts.tanasa.delia.g1096.clase.Asistent;
import cts.tanasa.delia.g1096.clase.Medic;
import cts.tanasa.delia.g1096.clase.PersonalSpital;
import cts.tanasa.delia.g1096.enums.TipPersonal;
import cts.tanasa.delia.g1096.enums.TipPersonalMedical;

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
