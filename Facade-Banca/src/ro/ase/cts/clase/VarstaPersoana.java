package ro.ase.cts.clase;

public class VarstaPersoana {
    private String nume;

    public VarstaPersoana(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void verificareVarsta(int varsta){
        if(varsta>=18){
            System.out.println(this.nume+"are varsta necesara pentru a va crea un cont");
        }
        else{
            System.out.println(this.nume+"trebuie sa fie major pt a si crea un cont la banca");
        }
    }


}
