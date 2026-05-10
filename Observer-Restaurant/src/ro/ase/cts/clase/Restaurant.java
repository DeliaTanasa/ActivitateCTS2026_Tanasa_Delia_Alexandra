package ro.ase.cts.clase;

import ro.ase.cts.client.Observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subiect{
    private String numeRestaurant;
    private List<Observer> listaClienti=new ArrayList<>();

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    @Override
    public void abonareClient(Observer observer) {
        listaClienti.add(observer);
    }

    @Override
    public void dezabonareClient(Observer observer) {
        listaClienti.remove(observer);
    }

    @Override
    public void notificareClienti(String mesaj) {
        for(Observer observeri:listaClienti){
            observeri.notificaClient(mesaj);
        }
    }

    public void notificareOferta(){
        notificareClienti("Tocmai a aparut oferta saptamanii in meniu!");
    }

    public void notificareMeniuNou(){
        notificareClienti("Meniul a fost schimbat. Te asteptam sa descoperi noul meniu!");
    }
}
