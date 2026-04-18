package cts.tanasa.delia.g1096.factoryMethod.fabrici;

import cts.tanasa.delia.g1096.factoryMethod.clase.AFisaMedicala;
import cts.tanasa.delia.g1096.factoryMethod.clase.PacientCardiologie;
import cts.tanasa.delia.g1096.factoryMethod.clase.PacientNeurologie;
import cts.tanasa.delia.g1096.factoryMethod.clase.PacientPneumologie;
import cts.tanasa.delia.g1096.factoryMethod.enums.TipPacientSectie;
import cts.tanasa.delia.g1096.factoryMethod.enums.TipSectie;

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
