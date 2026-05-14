package ro.ase.cts.clase;

public interface OrganizareMedicament {
    void detaliiMedicament();
    void adaugaNod(OrganizareMedicament organizareMedicamente);
    void stergeNod(OrganizareMedicament organizareMedicament);
    OrganizareMedicament getNod(int index);
}
