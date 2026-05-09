package ro.ase.cts.factoryMethod.fabrici;

import ro.ase.cts.factoryMethod.clase.AFisaMedicala;
import ro.ase.cts.factoryMethod.clase.PacientCardiologie;
import ro.ase.cts.factoryMethod.clase.PacientNeurologie;
import ro.ase.cts.factoryMethod.clase.PacientPneumologie;
import ro.ase.cts.factoryMethod.enums.TipPacientSectie;
import ro.ase.cts.factoryMethod.enums.TipSectie;

public class FisaMedicalaPacientFactory implements AFisaMedicalaFactory{

    @Override
    public AFisaMedicala creareFisaMedicala(TipSectie tipSectie, String nume, int[] CNP) {
        return switch (tipSectie){
            case TipPacientSectie.PACIENT_CARDIOLOGIE -> new PacientCardiologie(nume,CNP);
            case TipPacientSectie.PACIENT_NEUROLOGIE -> new PacientNeurologie(nume, CNP);
            case TipPacientSectie.PACIENT_PNEUMOLOGIE -> new PacientPneumologie(nume, CNP);
            default -> null;
        };
    }

    @Override
    public AFisaMedicala creareFisaMedicala(TipSectie tipSectie, String nume, int[] CNP, String notiteConsult) {
        return creareFisaMedicala(tipSectie,nume,CNP);
    }
}
