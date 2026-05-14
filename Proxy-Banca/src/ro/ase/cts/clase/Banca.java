package ro.ase.cts.clase;

public class Banca implements IBanca{
    private Cont cont;

    public Banca(Cont cont) {
        this.cont = cont;
    }

    public Cont getCont() {
        return cont;
    }

    public void setCont(Cont cont) {
        this.cont = cont;
    }

    @Override
    public void realizareCredit() {
        System.out.println("Ati realizat creditul in "+cont.getTipMoneda()+" in contul "+cont.getNrCont());
    }
}
