package cts.tanasa.delia.g1096.simpleFactory;

public class ProdusPerisabil implements ProdusGeneric{
    private String nume;
    private double pret;
    private String dataExpirare;

    public ProdusPerisabil(String nume, double pret, String dataExpirare) {
        this.nume = nume;
        this.pret = pret;
        this.dataExpirare=dataExpirare;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("ProdusPerisabil{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", dataExpirare=" + dataExpirare +
                '}');
    }
}
