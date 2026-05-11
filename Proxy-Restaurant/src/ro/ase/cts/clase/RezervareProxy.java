package ro.ase.cts.clase;

public class RezervareProxy implements Rezervare{
    private RezervareClient rezervareClient;

    public RezervareProxy(RezervareClient rezervareClient) {
        this.rezervareClient = rezervareClient;
    }

    public RezervareProxy(Client client) {
        this.rezervareClient=new RezervareClient(client);
    }

    @Override
    public void rezervareMasa() {
        if(rezervareClient.getClient().getNrPersoane()>=4){
            rezervareClient.rezervareMasa();
        }
        else{
            System.out.println("Rezervarea se face pentru minim 4 persoane");
        }
    }
}
