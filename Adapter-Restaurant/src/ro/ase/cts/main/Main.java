package ro.ase.cts.main;

import ro.ase.cts.clase.AdaptorBar;
import ro.ase.cts.clase.PrintareFactura;
import ro.ase.cts.clase.SoftBar;

public class Main {
    public static void main(String[] args) {
        SoftBar softBar=new SoftBar(2,100,200000);
        PrintareFactura printareFactura=new AdaptorBar(softBar);
        printareFactura.afisareDetalii();
    }
}
