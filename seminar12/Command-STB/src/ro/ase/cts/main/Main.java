package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Command;
import ro.ase.cts.clase.Operator;
import ro.ase.cts.clase.Plecare;

public class Main {
    public static void main(String[] args) {
        Operator operator=new Operator();
        Command command1=new Plecare(new Autobuz("Mercedes"),162);
        Command command2=new Plecare(new Autobuz("Audi"),100);

        operator.adaugaComanda(command1);
        operator.adaugaComanda(command2);
        operator.adaugaComanda(new Plecare(new Autobuz("Otokar"),20));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }


}
