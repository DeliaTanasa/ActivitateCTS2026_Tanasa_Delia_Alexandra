package ro.ase.cts.main;

import ro.ase.cts.clase.Grila;
import ro.ase.cts.clase.ProbaOrala;
import ro.ase.cts.clase.ProbaScrisa;
import ro.ase.cts.clase.Student;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Grigorescu");

        student.setModSustinere(new ProbaOrala());
        student.examinare();

        student.setModSustinere(new ProbaScrisa());
        student.examinare();
    }
}
