package cts.tanasa.delia.g1096.builder.main;

import cts.tanasa.delia.g1096.builder.CreareVehicul;
import cts.tanasa.delia.g1096.builder.CreareVehiculBuilder;
import cts.tanasa.delia.g1096.builder.NivelAutonomie;
import cts.tanasa.delia.g1096.builder.TipMotor;

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
