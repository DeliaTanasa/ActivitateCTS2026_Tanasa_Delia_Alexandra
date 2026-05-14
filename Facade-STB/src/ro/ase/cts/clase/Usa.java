package ro.ase.cts.clase;

public class Usa {
    private String pozitie;

    public Usa(String pozitie) {
        this.pozitie = pozitie;
    }

    public void usaModLiber(){
        System.out.println("Usa din "+this.pozitie+" va fi pusa in module liber");
    }

    public void usaDeschidereFortata(){
        System.out.println("Usa din "+this.pozitie+" va fi deschisa in mod fortat");
    }
}
