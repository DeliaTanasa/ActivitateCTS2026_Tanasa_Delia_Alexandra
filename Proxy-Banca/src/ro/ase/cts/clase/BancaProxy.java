package ro.ase.cts.clase;

public class BancaProxy implements IBanca{
    private Banca banca;

    public BancaProxy(Banca banca) {
        this.banca = banca;
    }

    @Override
    public void realizareCredit() {
        if(banca.getCont().getTipMoneda().equals("RON")){
            System.out.println("sunteti eligibil sa faceti creditul in ron");
        }
        else{
            System.out.println("nu sunteti eligibil sa faceti creditul pentru ca nu e in ron");
        }
    }
}
