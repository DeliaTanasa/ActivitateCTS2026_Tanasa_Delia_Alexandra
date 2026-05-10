package ro.ase.cts.main;

import ro.ase.cts.clase.Card;
import ro.ase.cts.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("Vlaicu");
        pacient.setModPlata(new Card());
        pacient.plateste(150000);
    }
}
