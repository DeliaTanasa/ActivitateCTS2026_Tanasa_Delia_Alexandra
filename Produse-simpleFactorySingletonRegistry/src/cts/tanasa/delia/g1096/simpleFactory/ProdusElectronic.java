package cts.tanasa.delia.g1096.simpleFactory;

public class ProdusElectronic implements ProdusGeneric{
    private String nume;
    private double pret;
    private String dataExpirare;

    public ProdusElectronic(String nume, double pret, String dataExpirare) {
        this.nume = nume;
        this.pret = pret;
        this.dataExpirare = dataExpirare;
    }


    @Override
    public void afiseazaDetalii() {
        System.out.println("ProdusElectronic{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", dataExpirare='" + dataExpirare + '\'' +
                '}');
    }
}
