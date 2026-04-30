package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.LinieFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1=new Autobuz("electric",2000,40);
        Autobuz autobuz2=new Autobuz("hibrid",2014,30);
        Autobuz autobuz3=new Autobuz("diesel",2021,35);

        LinieFactory linieFactory=new LinieFactory();
        linieFactory.getLinie(102,"CFR Progresul","Pantelimon").afiseazaAutobuzLinie(autobuz1);
        linieFactory.getLinie(103,"Piata Romana","Universitate").afiseazaAutobuzLinie(autobuz2);
        linieFactory.getLinie(102,"Piata Romana","Universitate").afiseazaAutobuzLinie(autobuz3);
    }
}
