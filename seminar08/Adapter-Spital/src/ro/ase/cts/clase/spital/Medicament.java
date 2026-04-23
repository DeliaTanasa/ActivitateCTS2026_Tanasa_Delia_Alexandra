package ro.ase.cts.clase.spital;

public class Medicament {
    private String numeMedicament;
    private float pret;

    public Medicament(String numeMedicament, float pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void achizitioneazaMedicament(){
        if(prezintaReteta()){
            System.out.println("Este achizitionat medicamentul "+this.numeMedicament+" la pretul de "+this.pret);
        }
        else{
            System.out.println("Pt medicamentul "+this.numeMedicament+" este nevoie de reteta");
        }
    }

    public boolean prezintaReteta(){
        return numeMedicament.contains("reteta");
    }
}
