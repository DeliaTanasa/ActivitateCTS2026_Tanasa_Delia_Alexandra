package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant=new Masa(7);
        Command ocupaMasa=new ComandaOcupare(restaurant);
        Command rezervaMasa=new ComandaRezervare(restaurant);
        Operator operator=new Operator();
        operator.invoca(ocupaMasa);
        operator.invoca(rezervaMasa);
    }
}
