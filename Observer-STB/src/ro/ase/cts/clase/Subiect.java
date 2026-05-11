package ro.ase.cts.clase;

import ro.ase.cts.client.Observer;

public interface Subiect {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void trimiteNotificare(String mesaj);
}
