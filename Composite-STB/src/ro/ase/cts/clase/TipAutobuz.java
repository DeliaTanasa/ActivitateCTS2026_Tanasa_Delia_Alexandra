package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class TipAutobuz implements FlotaCompanie{
    private String denumireGrup;
    private List<FlotaCompanie> listaFlote=new ArrayList<>();

    public TipAutobuz(String denumireGrup) {
        this.denumireGrup = denumireGrup;
    }

    @Override
    public void descriere() {
        System.out.println("Grup "+this.denumireGrup);
        for(FlotaCompanie flote:listaFlote){
            flote.descriere();
        }
    }

    @Override
    public void adaugaNod(FlotaCompanie flotaCompanie) {
        listaFlote.add(flotaCompanie);
    }

    @Override
    public void stergeNod(FlotaCompanie flotaCompanie) {
        listaFlote.remove(flotaCompanie);
    }

    @Override
    public FlotaCompanie getNotCopil(int index) {
        return listaFlote.get(index);
    }
}
