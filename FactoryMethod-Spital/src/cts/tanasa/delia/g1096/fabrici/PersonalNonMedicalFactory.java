package cts.tanasa.delia.g1096.fabrici;

import cts.tanasa.delia.g1096.clase.Brancardier;
import cts.tanasa.delia.g1096.clase.PersonalSpital;
import cts.tanasa.delia.g1096.clase.Registrator;
import cts.tanasa.delia.g1096.clase.Secretar;
import cts.tanasa.delia.g1096.enums.TipPersonal;
import cts.tanasa.delia.g1096.enums.TipPersonalNonMedical;

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
