package ro.ase.cts.clase;

public class FilialaBanca implements SucursalaBanca{
    private String nume;

    public FilialaBanca(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Filiala: "+this.nume);
    }

    @Override
    public void adaugareNod(SucursalaBanca sucursalaBanca) {
        System.out.println("nu e implementata");
    }

    @Override
    public void stergeNod(SucursalaBanca sucursalaBanca) {
        System.out.println("nu e implementata");
    }

    @Override
    public SucursalaBanca getNod(int index) {
        return null;
    }
}
