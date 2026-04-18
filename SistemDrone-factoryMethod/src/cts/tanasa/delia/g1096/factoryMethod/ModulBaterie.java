package cts.tanasa.delia.g1096.factoryMethod;

public class ModulBaterie extends AbstractModule{
    private int volti;
    private double dimensiune;

    public ModulBaterie(String name,String description,float price,int volti, double dimensiune) {
        this.name=name;
        this.description=description;
        this.price=price;
        this.volti = volti;
        this.dimensiune = dimensiune;
    }

    @Override
    public String toString() {
        return "ModulBaterie{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", volti=" + volti +
                ", dimensiune=" + dimensiune +
                '}';
    }

    public void setVolti(int volti) {
        this.volti = volti;
    }

    public void setDimensiune(double dimensiune) {
        this.dimensiune = dimensiune;
    }
}
