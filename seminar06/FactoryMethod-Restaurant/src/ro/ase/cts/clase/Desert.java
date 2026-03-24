package ro.ase.cts.clase;

public abstract class Desert implements FelDeMancare{
    private int nrCalorii;
    private double pret;
    private int gramaj;

    public Desert(int calorii, double pret, int gramaj) {
        this.nrCalorii = calorii;
        this.pret = pret;
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Desert{");
        sb.append("calorii=").append(nrCalorii);
        sb.append(", pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }
}
