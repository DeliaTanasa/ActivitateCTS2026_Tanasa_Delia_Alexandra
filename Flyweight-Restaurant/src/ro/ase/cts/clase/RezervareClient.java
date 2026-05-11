package ro.ase.cts.clase;

public class RezervareClient implements IRezervare{
    private String nume;
    private String nrTelefon;
    private String adresaEmail;

    public RezervareClient(String nume, String nrTelefon, String adresaEmail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresaEmail = adresaEmail;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getAdresaEmail() {
        return adresaEmail;
    }

    public void setAdresaEmail(String adresaEmail) {
        this.adresaEmail = adresaEmail;
    }

    @Override
    public void detaliiRezervare(MasaRezervata masaRezervata) {
        System.out.println("Clientul "+this.nume+
                " cu numarul de telefon "+this.nrTelefon+
                " si adresa de mail "+this.adresaEmail+
                " a realizat o rezervare pentru "+masaRezervata.getNrPersoane()+
                " care va fi la masa "+masaRezervata.getNrMasa()+
                " pentru ora "+masaRezervata.getOraRezervare());
    }
}
