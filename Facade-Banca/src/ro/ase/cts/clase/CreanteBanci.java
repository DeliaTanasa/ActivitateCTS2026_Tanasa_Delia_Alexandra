package ro.ase.cts.clase;

public class CreanteBanci {
    private String nume;

    public CreanteBanci(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void verificareCreante(boolean areCreante){
        if(areCreante){
            System.out.println(this.nume+" nu isi poate crea cont pentru ca are creante la alte banci");
        }
        else{
            System.out.println(this.nume+" isi poate crea cont pentru ca nu are creante la alte banci");

        }
    }
}
