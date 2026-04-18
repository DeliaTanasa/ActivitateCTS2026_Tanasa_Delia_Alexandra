package cts.tanasa.delia.g1096.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeRezervare rezervare1=new Rezervare("Ana",4,"12:00");
        PrototypeRezervare rezervare2= ((Rezervare) rezervare1).clone();
        rezervare1.afiseazaDetalii();
        rezervare2.afiseazaDetalii();
        System.out.println(rezervare1==rezervare2);
        ((Rezervare)rezervare2).setNrPersoane(20);
        rezervare2.afiseazaDetalii();
        rezervare1.afiseazaDetalii();
    }
}
