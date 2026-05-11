package ro.ase.cts.main;

import ro.ase.cts.clase.Rezultate;
import ro.ase.cts.clase.RezultatePrintate;
import ro.ase.cts.decorator.RezultateDecorator;
import ro.ase.cts.decorator.RezultatePlatformaOnline;

public class Main {
    public static void main(String[] args) {
        Rezultate rezultate=new RezultatePrintate();
        rezultate.trimitereRezultate();

        RezultateDecorator rezultate1=new RezultatePlatformaOnline(rezultate);
        rezultate1.trimitereRezultate();
        rezultate1.trimitereRezultateOnline();
    }
}
