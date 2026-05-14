package ro.ase.cts.clase;

public class Cazier {
    private String nume;

    public Cazier(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void verificareCazier(boolean areCazier){
        if(areCazier){
            System.out.println(this.nume+" nu isi poate face un cont la banca din cauza ca are cazier");
        }
        else{
            System.out.println(this.nume+" isi poate face un cont la banca, nu are cazier");

        }
    }
}
