package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class TipMedicament implements OrganizareMedicament{
    private String nume;
    private List<OrganizareMedicament> organizareMedicamentLista=new ArrayList<>();

    public TipMedicament(String nume) {
        this.nume = nume;
    }

    @Override
    public void detaliiMedicament() {
        System.out.println("Sectiunea: "+ this.nume);
        for(OrganizareMedicament organizareMedicament:organizareMedicamentLista){
            organizareMedicament.detaliiMedicament();
        }
    }

    @Override
    public void adaugaNod(OrganizareMedicament organizareMedicamente) {
        organizareMedicamentLista.add(organizareMedicamente);
    }

    @Override
    public void stergeNod(OrganizareMedicament organizareMedicament) {
        organizareMedicamentLista.remove(organizareMedicament);
    }

    @Override
    public OrganizareMedicament getNod(int index) {
        return organizareMedicamentLista.get(index);
    }
}
