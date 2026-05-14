package ro.ase.cts.clase;

public class ContTrei extends Cont{

    public ContTrei(double sold, String numeCont) {
        super(sold, numeCont);
    }

    @Override
    public void realizarePlata(double suma) {
        if(this.getSold()>suma){
            System.out.println("Plata de "+suma+" lei a fost realizata "+this.getNumeCont());
        }
        else{
            System.out.println(this.getNumeCont()+" nu are foncuri suficiente. incearca la urmatorul");
            this.getContUrmator().realizarePlata(suma);
        }
    }
}
