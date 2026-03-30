package ro.ase.cts.prototype;

public class Reteta implements PrototypeReteta{
    private String numeMedicament;
    private int nrSolutii;
    private int cantitatiSolutii;

    public Reteta(String numeMedicament, int nrSolutii, int cantitatiSolutii) {
        this.numeMedicament = numeMedicament;
        if(nrSolutii<=7){
            this.nrSolutii = nrSolutii;
        }
        if(cantitatiSolutii<500){
            this.cantitatiSolutii = cantitatiSolutii;
        }
    }

    private Reteta() {
    }

    public void setNrSolutii(int nrSolutii) {
        this.nrSolutii = nrSolutii;
    }

    public void setCantitatiSolutii(int cantitatiSolutii) {
        this.cantitatiSolutii = cantitatiSolutii;
    }

    @Override
    public String toString() {
        return "ro.ase.cts.prototype.Reteta{" +
                "numeMedicament='" + numeMedicament + '\'' +
                ", nrSolutii=" + nrSolutii +
                ", cantitatiSolutii=" + cantitatiSolutii +
                '}';
    }

    @Override
    public PrototypeReteta cloneaza() {
        Reteta reteta=new Reteta();
        reteta.numeMedicament=this.numeMedicament;
        reteta.nrSolutii=this.nrSolutii;
        reteta.cantitatiSolutii=this.cantitatiSolutii;
        return reteta;

    }
}
