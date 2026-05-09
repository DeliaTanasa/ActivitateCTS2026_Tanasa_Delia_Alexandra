package ro.ase.cts.builder.main;

import ro.ase.cts.builder.CreareVehicul;
import ro.ase.cts.builder.CreareVehiculBuilder;
import ro.ase.cts.builder.NivelAutonomie;
import ro.ase.cts.builder.TipMotor;

public class Main {
    public static void main(String[] args) {
//        CreareVehicul creareVehicul1=new CreareVehiculBuilder().setNrVehicule(100).setAreSenzoriLidar(true).setTipMotor(TipMotor.ELECTRIC).setNivelAutonomie(NivelAutonomie.L5).build();
        CreareVehicul creareVehicul2=new CreareVehiculBuilder().setNrVehicule(100).setAreSenzoriLidar(true).setTipMotor(TipMotor.ELECTRIC).setNivelAutonomie(NivelAutonomie.L3).setCamera("4K").setCapacitateIncarcare(20000).build();
        CreareVehicul creareVehicul3=new CreareVehiculBuilder().setNrVehicule(100).setAreSenzoriLidar(true).setTipMotor(TipMotor.ELECTRIC).setNivelAutonomie(NivelAutonomie.L4).setCamera("HD").setCapacitateBaterie(20000).setCapacitateIncarcare(100).setGPS("virtual").build();
        creareVehicul2.veziStatus();
        creareVehicul3.inregistreazaVehicul();
        creareVehicul2.trimiteComanda();
//        System.out.println(creareVehicul1);
        System.out.println(creareVehicul2);
        System.out.println(creareVehicul3);

    }
}
