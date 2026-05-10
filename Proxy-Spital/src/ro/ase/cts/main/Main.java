package ro.ase.cts.main;

import ro.ase.cts.clase.InternarePacient;
import ro.ase.cts.clase.InternareProxy;
import ro.ase.cts.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("Bogdan",false);
        InternarePacient internarePacient=new InternarePacient(pacient);
        internarePacient.internare();

        InternareProxy internareProxy=new InternareProxy(internarePacient);
        internareProxy.internare();
    }
}
