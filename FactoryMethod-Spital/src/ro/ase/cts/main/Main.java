package ro.ase.cts.main;

import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.enums.TipPersonalMedical;
import ro.ase.cts.enums.TipPersonalNonMedical;
import ro.ase.cts.fabrici.PersonalFactory;
import ro.ase.cts.fabrici.PersonalMedicalFactory;
import ro.ase.cts.fabrici.PersonalNonMedicalFactory;

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
