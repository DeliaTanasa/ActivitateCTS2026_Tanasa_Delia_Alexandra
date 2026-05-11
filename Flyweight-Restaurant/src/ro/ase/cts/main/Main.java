package ro.ase.cts.main;

import ro.ase.cts.clase.FabricaRezervari;
import ro.ase.cts.clase.MasaRezervata;
import ro.ase.cts.clase.RezervareClient;

public class Main {
    public static void main(String[] args) {
        FabricaRezervari fabricaRezervari=new FabricaRezervari();

        MasaRezervata masaRezervata1=new MasaRezervata(1,20,"20:00");
        MasaRezervata masaRezervata2=new MasaRezervata(7,4,"18:00");
        MasaRezervata masaRezervata3=new MasaRezervata(5,4,"19:00");

        fabricaRezervari.getRezervare("Ionescu","10287345","ionescu@gmail.com").detaliiRezervare(masaRezervata1);
        fabricaRezervari.getRezervare("Ionescu","937464","ionescuscu@gmail.com").detaliiRezervare(masaRezervata2);
        fabricaRezervari.getRezervare("Visinescu","djdhbhdf","Visinescu@gmail.com").detaliiRezervare(masaRezervata3);

    }
}
