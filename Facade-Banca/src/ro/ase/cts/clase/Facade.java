package ro.ase.cts.clase;

public class Facade {
    // ro.ase.cts.clase.Facade-ul deține referințe către subsisteme
    public static boolean verificareEligibilitate(String nume, String cnp, int varsta, boolean areCazier, boolean areCreante) {

        VarstaPersoana v = new VarstaPersoana(nume);
        if (varsta < 18) {
            v.verificareVarsta(varsta);
            return false;
        }

        Cazier c = new Cazier(nume);
        if (areCazier) {
            c.verificareCazier(areCazier);
            return false;
        }

        CreanteBanci cb = new CreanteBanci(nume);
        if (areCreante) {
            cb.verificareCreante(areCreante);
            return false;
        }

        return true; // Dacă trece de toate, este eligibil
    }
}