package ro.ase.cts.clase;

public class Autobuz implements FlotaCompanie{
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void descriere() {
        System.out.println("Autobuzul de tip "+this.model+", este produs de "+this.producator+" si are "+this.nrLocuri+" lde locuri");
    }

    @Override
    public void adaugaNod(FlotaCompanie flotaCompanie) {
        System.out.println("Nu este implementata");
    }

    @Override
    public void stergeNod(FlotaCompanie flotaCompanie) {
        System.out.println("Nu este implementata");
    }

    @Override
    public FlotaCompanie getNotCopil(int index) {
        return null;
    }
}
