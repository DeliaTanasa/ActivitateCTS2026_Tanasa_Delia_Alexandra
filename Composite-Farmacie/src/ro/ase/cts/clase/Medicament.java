package ro.ase.cts.clase;

public class Medicament implements OrganizareMedicament{
    private String nume;

    public Medicament(String nume) {
        this.nume = nume;
    }

    @Override
    public void detaliiMedicament() {
        System.out.println("Medicament: "+this.nume);
    }

    @Override
    public void adaugaNod(OrganizareMedicament organizareMedicamente) {
        System.out.println("nu e implementata");
    }

    @Override
    public void stergeNod(OrganizareMedicament organizareMedicament) {
        System.out.println("nu e implementata");
    }

    @Override
    public OrganizareMedicament getNod(int index) {
        return null;
    }
}
