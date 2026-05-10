package ro.ase.cts.main;

import ro.ase.cts.clase.Restaurant;
import ro.ase.cts.client.ClientFidel;

public class Main {
    public static void main(String[] args) {
        ClientFidel clientFidel1=new ClientFidel("Vasile");
        ClientFidel clientFidel2=new ClientFidel("Anisoiu");
        ClientFidel clientFidel3=new ClientFidel("Mocanu");
        Restaurant restaurant=new Restaurant("Malul marii");
        restaurant.abonareClient(clientFidel1);
        restaurant.abonareClient(clientFidel2);
        restaurant.abonareClient(clientFidel3);
        restaurant.notificareMeniuNou();
        System.out.println();
        restaurant.dezabonareClient(clientFidel1);
        restaurant.notificareOferta();
    }
}
