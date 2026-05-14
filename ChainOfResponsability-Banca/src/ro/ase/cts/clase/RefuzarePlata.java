package ro.ase.cts.clase;

public class RefuzarePlata extends Cont{


    public RefuzarePlata() {
        super(0,"final");
    }

    @Override
    public void realizarePlata(double suma) {
        System.out.println("Plata dumneavoastra a fost refuzata");
    }
}
