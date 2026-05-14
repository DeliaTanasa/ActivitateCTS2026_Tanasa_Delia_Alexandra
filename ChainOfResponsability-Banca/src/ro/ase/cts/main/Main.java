package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        Cont cont1=new ContUnu(100,"Cont curent");
        Cont cont2=new ContUnu(500,"Cont economii");
        Cont cont3=new ContUnu(1000,"Cont credit");
        Cont cont4=new RefuzarePlata();

        cont1.setContUrmator(cont2);
        cont2.setContUrmator(cont3);
        cont3.setContUrmator(cont4);
        cont1.realizarePlata(999);
    }
}
