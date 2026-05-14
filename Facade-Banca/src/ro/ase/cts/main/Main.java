package ro.ase.cts.main;

import ro.ase.cts.clase.Facade;

public class Main {
    public static void main(String[] args) {
        // Operatorul introduce datele o singură dată
        String nume = "Popescu Ion";
        int varsta = 17;
        boolean areCazier = false;
        boolean areCreante = false;

        // Apelul simplificat prin ro.ase.cts.clase.Facade
        if (Facade.verificareEligibilitate(nume, "123456789", varsta, areCazier, areCreante)) {
            System.out.println("Contul poate fi creat.");
        } else {
            System.out.println("Contul NU poate fi creat.");
        }
    }
}