package ro.ase.cts.main;

import ro.ase.cts.factoryMethod.clase.AFisaMedicala;
import ro.ase.cts.factoryMethod.enums.TipDoctorSectie;
import ro.ase.cts.factoryMethod.enums.TipPacientSectie;
import ro.ase.cts.factoryMethod.fabrici.AFisaMedicalaFactory;
import ro.ase.cts.factoryMethod.fabrici.FisaMedicalaDoctorFactory;
import ro.ase.cts.factoryMethod.fabrici.FisaMedicalaPacientFactory;
import ro.ase.cts.prototype.FisaMedicala;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        AFisaMedicalaFactory factory= new FisaMedicalaPacientFactory();
        AFisaMedicala aFisaMedicala1=factory.creareFisaMedicala(TipPacientSectie.PACIENT_PNEUMOLOGIE,"Ion",new int[]{1,2,3,4,5,6,9,8,0,0});
        AFisaMedicala aFisaMedicala2=factory.creareFisaMedicala(TipPacientSectie.PACIENT_CARDIOLOGIE,"Ana",new int[]{8,9,4,6,3,5,5,2,0,0});
        AFisaMedicala aFisaMedicala3=factory.creareFisaMedicala(TipPacientSectie.PACIENT_NEUROLOGIE,"Ion",new int[]{0,4,0,3,9,8,7,8,0,0});
        System.out.println(aFisaMedicala1);
        System.out.println(aFisaMedicala2);
        System.out.println(aFisaMedicala3);

        AFisaMedicalaFactory factoryMedic=new FisaMedicalaDoctorFactory();
        AFisaMedicala aFisaMedicala4=factoryMedic.creareFisaMedicala(TipDoctorSectie.MEDIC_NEUROLOGIE,"David",new int[]{1,2,3,4,5,6,9,8,0,0},"se confrunta cu tulburari");
        System.out.println(aFisaMedicala4);

        System.out.println("\nprototype");
        FisaMedicala fisaMedicala=new FisaMedicala("Fisa fractura","Eugen",new int[]{2,3,4,5,6,7,7});
        FisaMedicala fisaMedicala1= (FisaMedicala) fisaMedicala.clone();
        FisaMedicala fisaMedicala2= (FisaMedicala) fisaMedicala.clone();
        System.out.println(fisaMedicala);
        System.out.println(fisaMedicala1);
        System.out.println(fisaMedicala2);
        fisaMedicala2.setTipFisa("Fisa luxatie");
        fisaMedicala2.setNume("Valeriu");
        fisaMedicala2.setCNP(new int[]{1,2,3,4});
        System.out.println(fisaMedicala2);
        System.out.println(fisaMedicala1);
        System.out.println(fisaMedicala==fisaMedicala2);

    }
}
