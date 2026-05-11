package ro.ase.cts.clase;

import ro.ase.cts.client.Observer;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements Subiect{
    private int nrLinie;
    private List<Observer> observeri=new ArrayList<>();

    public Autobuz(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    @Override
    public void adaugaObserver(Observer observer) {
        observeri.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        observeri.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Observer observer:observeri){
            observer.anuntCalatorie(this.nrLinie+": "+ mesaj);
        }
    }

    public void startCursa(){
        trimiteNotificare("Autobuzul de pe linia "+this.nrLinie+" tocmai a plecat in cursa de la capatul de linie");
    }
}
