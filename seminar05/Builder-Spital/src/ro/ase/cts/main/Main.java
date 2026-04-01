package ro.ase.cts.main;

import ro.ase.cts.builder01.AbstractBuilder;
import ro.ase.cts.builder01.Internare;
import ro.ase.cts.builder01.InternareBuilder;
import ro.ase.cts.builder02.AbstractBuilder02;
import ro.ase.cts.builder02.InternareBuilder02;

public class Main {
    public static void main(String[] args) {
        //de intrebat aici despre constructor
        Internare internare1=new InternareBuilder("Georgel").build();//tre sa fac asa daca am constructoru privat
        internare1.setNumePacient("Gerogel");
        internare1.setPatRabatabil(true);

        Internare internare2=new Internare();
        internare1.setNumePacient("Gerogica");
        internare1.setPatRabatabil(true);

        AbstractBuilder builder=new InternareBuilder("Georgica");

        Internare internare3=builder.setPatRabatabil(true).build();
        Internare internare4=builder.setArePapuciCamera(true).setNume("Gigel").build();
        System.out.println(internare3.toString());
        System.out.println(internare4.toString());


        AbstractBuilder02 builder02=new InternareBuilder02();
        builder02.setMicDejunInclus(true);
        ro.ase.cts.builder02.Internare internare5=builder02.build("Georgica");
        ro.ase.cts.builder02.Internare internare6=builder02.build("Gigel");

        internare5.setHalat(true);

    }
}
