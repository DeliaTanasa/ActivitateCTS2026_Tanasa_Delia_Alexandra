package ro.ase.cts.client;

public class Calator implements Observer{
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void anuntCalatorie(String mesaj) {
        System.out.println("Calatorul "+this.nume+" primeste mesajul "+mesaj);
    }
}
