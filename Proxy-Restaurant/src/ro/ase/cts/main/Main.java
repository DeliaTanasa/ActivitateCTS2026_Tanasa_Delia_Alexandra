package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareClient;
import ro.ase.cts.clase.RezervareProxy;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Antonescu",2);
        Rezervare rezervare=new RezervareClient(client);
        rezervare.rezervareMasa();

        Rezervare rezervare1=new RezervareProxy(client);
        rezervare1.rezervareMasa();
    }
}
