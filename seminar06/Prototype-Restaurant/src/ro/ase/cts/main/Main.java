package ro.ase.cts.main;

import ro.ase.cts.clase.PrototypeRezervare;
import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        PrototypeRezervare rezervare=new Rezervare("Ana",6,"20:00","0744234908");
        PrototypeRezervare rezervare1=rezervare.copiaza();
        ((Rezervare) rezervare1).setOra("13:00");
        ((Rezervare) rezervare1).setNrPersoane(10);
        System.out.println(rezervare.toString());
        System.out.println(rezervare1.toString());
    }
}
