package ro.ase.cts.clase;

public class Student{

    private ModSustinere modSustinere;
    private String nume;

    public Student() {
        this.modSustinere=new Grila();
    }

    public Student(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public Student(String nume) {
        this.nume = nume;
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare(){
        modSustinere.sustinereExamen();
    }
}
