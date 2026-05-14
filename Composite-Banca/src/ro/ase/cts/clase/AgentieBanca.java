package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class AgentieBanca implements SucursalaBanca{
    private String nume;
    private List<SucursalaBanca> listaSucursale=new ArrayList<>();

    public AgentieBanca(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {

        System.out.println("Agentia: "+this.nume);
        for(SucursalaBanca sucursalaBanca:listaSucursale){
            sucursalaBanca.descriere();
        }
    }

    @Override
    public void adaugareNod(SucursalaBanca sucursalaBanca) {
        listaSucursale.add(sucursalaBanca);
    }

    @Override
    public void stergeNod(SucursalaBanca sucursalaBanca) {
        listaSucursale.remove(sucursalaBanca);
    }

    @Override
    public SucursalaBanca getNod(int index) {
        return listaSucursale.get(index);

    }
}
