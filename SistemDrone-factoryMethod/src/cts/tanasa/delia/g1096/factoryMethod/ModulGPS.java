package cts.tanasa.delia.g1096.factoryMethod;

public class ModulGPS extends AbstractModule{
    private int nrDirectii;
    private double procentBaterie;

    public ModulGPS(String name,String description,float price,int nrDirectii, double procentBaterie) {
        this.name=name;
        this.description=description;
        this.price=price;
        this.nrDirectii=nrDirectii;
        this.procentBaterie=procentBaterie;

    }

    @Override
    public String toString() {
        return "ModulGPS{" +
                "nrDirectii=" + nrDirectii +
                ", procentBaterie=" + procentBaterie +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public void setNrDirectii(int nrDirectii) {
        this.nrDirectii = nrDirectii;
    }

    public void setProcentBaterie(double procentBaterie) {
        this.procentBaterie = procentBaterie;
    }
}
