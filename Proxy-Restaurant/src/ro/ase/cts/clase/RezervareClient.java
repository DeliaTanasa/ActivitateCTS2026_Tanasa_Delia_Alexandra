package ro.ase.cts.clase;

public class RezervareClient implements Rezervare{
    private Client client;

    public RezervareClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public void rezervareMasa() {
        System.out.println("Ati rezervat o masa cu succes!");
    }
}
