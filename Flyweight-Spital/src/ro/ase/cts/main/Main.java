package ro.ase.cts.main;

import ro.ase.cts.clase.FabricaInternari;
import ro.ase.cts.clase.InformatiiInternare;

public class Main {
    public static void main(String[] args) {
        FabricaInternari fabricaInternari=new FabricaInternari();

        InformatiiInternare internare1=new InformatiiInternare("19.02.1990",7,2,14);
        InformatiiInternare internare2=new InformatiiInternare("09.02.2020",3,1,5);
        InformatiiInternare internare3=new InformatiiInternare("23.03.2018",19,7,11);
        InformatiiInternare internare4=new InformatiiInternare("01.01.2001",2,4,10);

        fabricaInternari.getInternare("1234","Ionescu","09873553","Aleea stejarului").detaliiSpitalizare(internare1);
        fabricaInternari.getInternare("938746","Avramescu","384675","Aleea trandafirilor").detaliiSpitalizare(internare2);
        fabricaInternari.getInternare("10903884","Georgescu","9478497","Strada chibzuintei").detaliiSpitalizare(internare3);
        fabricaInternari.getInternare("1234","Marinescu","7365478","Strada Scolii").detaliiSpitalizare(internare4);


    }
}
