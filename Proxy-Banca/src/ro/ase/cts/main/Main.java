package ro.ase.cts.main;

import ro.ase.cts.clase.Banca;
import ro.ase.cts.clase.BancaProxy;
import ro.ase.cts.clase.Cont;
import ro.ase.cts.clase.IBanca;

public class Main {
    public static void main(String[] args) {
        Cont cont=new Cont(7,"RON");
        Banca banca=new Banca(cont);
        banca.realizareCredit();
        IBanca banca1=new BancaProxy(banca);
        banca1.realizareCredit();
    }
}
