package cts.tanasa.delia.g1096.simpleFactory;

public class ProdusFactory {
    public static ProdusGeneric creareProdus(String tip,String nume,double pret,String dataExpirare) throws Exception {
        switch (tip){
            case "bio":
                return new ProdusBio(nume,pret,dataExpirare);
            case "electronic":
                return new ProdusElectronic(nume,pret,dataExpirare);
            case "perisabil":
                return new ProdusPerisabil(nume,pret,dataExpirare);
            default:
                throw new Exception("Produsul nu e de nicuun tip");
        }
    }
}
