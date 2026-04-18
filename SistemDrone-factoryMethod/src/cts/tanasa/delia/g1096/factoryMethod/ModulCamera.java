package cts.tanasa.delia.g1096.factoryMethod;

public class ModulCamera extends AbstractModule{
    private int rezolutie;
    private double anFabricatie;

    public ModulCamera(String name,String description,float price,int rezolutie, double anFabricatie) {
        this.name=name;
        this.description=description;
        this.price=price;
        this.rezolutie=rezolutie;
        this.anFabricatie=anFabricatie;
    }

    @Override
    public String toString() {
        return "ModulCamera{" +
                "rezolutie=" + rezolutie +
                ", anFabricatie=" + anFabricatie +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public void setRezolutie(int rezolutie) {
        this.rezolutie = rezolutie;
    }

    public void setAnFabricatie(double anFabricatie) {
        this.anFabricatie = anFabricatie;
    }
}
