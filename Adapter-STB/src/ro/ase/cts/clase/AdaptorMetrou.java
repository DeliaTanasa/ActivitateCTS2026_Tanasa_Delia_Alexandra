package ro.ase.cts.clase;

public class AdaptorMetrou implements ValidatorTransport{
    private Metrou metrou;

    public AdaptorMetrou(Metrou metrou) {
        this.metrou = metrou;
    }

    @Override
    public void validareBilet() {
        this.metrou.scanarereBilet();
    }

    @Override
    public void validareAbonament() {
        this.metrou.scanareAbonament();
    }
}
