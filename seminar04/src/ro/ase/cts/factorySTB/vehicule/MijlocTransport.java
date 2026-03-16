package ro.ase.cts.factorySTB.vehicule;

public abstract class MijlocTransport {
    private String marca;
    private int linia;

    public MijlocTransport(String marca,int linia){
        this.marca=marca;
        this.linia=linia;
    }

    public abstract void afisareDescriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("marca= ").append(marca);
        sb.append(", linia= ").append(linia);
        sb.append('}');
        return sb.toString();
    }
}
