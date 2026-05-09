package ro.ase.cts.main;

import ro.ase.cts.prototype.Autobuz;
import ro.ase.cts.prototype.IMijlocTransport;

public class Main {
    public static void main(String[] args) {
        IMijlocTransport autobuz=new Autobuz("Mercedes",54,4);
        IMijlocTransport autobuz1=autobuz.cloneaza();
        autobuz.afisareDetalii();
        autobuz1.afisareDetalii();
        System.out.println(autobuz1==autobuz);
        ((Autobuz)autobuz1).setNrLocuri(44);
        autobuz1.afisareDetalii();
        autobuz.afisareDetalii();

    }
}
