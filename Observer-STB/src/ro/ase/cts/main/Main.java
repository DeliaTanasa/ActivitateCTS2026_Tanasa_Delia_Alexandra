package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.client.Calator;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(162);

        Calator calator1 = new Calator("Petrescu");
        Calator calator2 = new Calator("Savin");
        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);
        autobuz.startCursa();
    }
}
