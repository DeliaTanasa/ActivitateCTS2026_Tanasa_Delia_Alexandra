package ro.ase.cts.clase;

import ro.ase.cts.client.Observer;

public interface Subiect {
    void abonareClient(Observer observer);
    void dezabonareClient(Observer observer);
    void notificareClienti(String mesaj);
}
