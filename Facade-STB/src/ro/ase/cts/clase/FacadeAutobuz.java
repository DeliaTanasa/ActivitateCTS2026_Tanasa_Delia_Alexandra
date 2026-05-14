package ro.ase.cts.clase;

public class FacadeAutobuz {
    private Usa usaFata;
    private Usa usaMijloc;
    private Usa usaSpate;

    public FacadeAutobuz() {
        this.usaFata = new Usa("Fata");
        this.usaMijloc = new Usa("Mijloc");
        this.usaSpate = new Usa("Spate");
    }

    public void deschidereUsiLiber(){
        usaFata.usaModLiber();
        usaMijloc.usaModLiber();
        usaSpate.usaModLiber();
    }

    public void deschidereUsiFortat(){
        usaFata.usaDeschidereFortata();
        usaMijloc.usaDeschidereFortata();
        usaSpate.usaDeschidereFortata();
    }
}
