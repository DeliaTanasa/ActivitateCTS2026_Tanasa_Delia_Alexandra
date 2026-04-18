package cts.tanasa.delia.g1096.simpleFactory;

public class ProdusBio implements ProdusGeneric{
    private String nume;
    private double pret;
    private String dataExpirare;

    public ProdusBio(String nume, double pret, String dataExpirare) {
        this.nume = nume;
        this.pret = pret;
        this.dataExpirare = dataExpirare;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("ProdusBio{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", dataExpirare='" + dataExpirare + '\'' +
                '}');
    }
}
