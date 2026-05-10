package ro.ase.cts.client;

public class ClientFidel implements Observer{
    private String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificaClient(String mesaj) {
        System.out.println("Clientul "+this.nume+" a primit o notificare in care scrie: "+mesaj);
    }
}
