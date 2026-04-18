package cts.tanasa.delia.g1096.main;

import cts.tanasa.delia.g1096.clase.PersonalSpital;
import cts.tanasa.delia.g1096.enums.TipPersonalMedical;
import cts.tanasa.delia.g1096.enums.TipPersonalNonMedical;
import cts.tanasa.delia.g1096.fabrici.PersonalFactory;
import cts.tanasa.delia.g1096.fabrici.PersonalMedicalFactory;
import cts.tanasa.delia.g1096.fabrici.PersonalNonMedicalFactory;

public class Main {
    public static void main(String[] args) {
        PersonalFactory personalFactory=new PersonalMedicalFactory();
        PersonalSpital medic =personalFactory.crearePersonal(TipPersonalMedical.MEDIC,"Ana",4500,13);
        PersonalSpital asistent =personalFactory.crearePersonal(TipPersonalMedical.ASISTENT,"Maria",3000,20);
        medic.afisareDescriere();
        asistent.afisareDescriere();

        PersonalFactory personalFactory1=new PersonalNonMedicalFactory();
        PersonalSpital registrator=personalFactory1.crearePersonal(TipPersonalNonMedical.REGISTRATOR,"Aurel",5000);
        PersonalSpital brancardier=personalFactory1.crearePersonal(TipPersonalNonMedical.BRANCARDIER,"Ion",3000);
        registrator.afisareDescriere();
        brancardier.afisareDescriere();

    }
}
