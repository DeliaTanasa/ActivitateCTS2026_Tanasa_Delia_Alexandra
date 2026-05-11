package ro.ase.cts.clase;

public class Pacient implements IPacient{
    private String cnp;
    private String nume;
    private String nrTelefon;
    private String adresa;

    public Pacient(String cnp, String nume, String nrTelefon, String adresa) {
        this.cnp = cnp;
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
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

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "cnp='" + cnp + '\'' +
                ", nume='" + nume + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }

    @Override
    public void detaliiSpitalizare(InformatiiInternare info) {
        System.out.println("Spitalizarea se face pentru pacientul "+this.nume
                +", cu cnp-ul "+this.cnp+
                ", nr de teleon "+this.nrTelefon+
                " si adresa "+this.adresa+"\n"+
                " incepand cu data de "+info.getDataSpitalizare()+
                " in salonul "+info.getNrsalon()+
                " si patul "+info.getNrPat()+
                " pentru "+info.getZileSpitalizare()+" zile de spitalizare.");
    }
}
