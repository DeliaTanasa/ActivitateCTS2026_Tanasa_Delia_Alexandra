package ro.ase.cts.factoryMethod.fabrici;

import ro.ase.cts.factoryMethod.clase.AFisaMedicala;
import ro.ase.cts.factoryMethod.clase.DoctorCardiologie;
import ro.ase.cts.factoryMethod.clase.DoctorNeurologie;
import ro.ase.cts.factoryMethod.clase.DoctorPneumologie;
import ro.ase.cts.factoryMethod.enums.TipDoctorSectie;
import ro.ase.cts.factoryMethod.enums.TipSectie;

public class FisaMedicalaDoctorFactory implements AFisaMedicalaFactory{

    @Override
    public AFisaMedicala creareFisaMedicala(TipSectie tipSectie, String nume, int[] CNP) {
        return creareFisaMedicala(tipSectie,nume,CNP,"diagnostic scolioza");
    }

    @Override
    public AFisaMedicala creareFisaMedicala(TipSectie tipSectie, String nume, int[] CNP, String notiteConsult) {
        return switch (tipSectie){
            case TipDoctorSectie.MEDIC_CARDIOLOGIE-> new DoctorCardiologie(nume,CNP,notiteConsult);
            case TipDoctorSectie.MEDIC_NEUROLOGIE -> new DoctorNeurologie(nume,CNP,notiteConsult);
            case TipDoctorSectie.MEDIC_PNEUMOLOGIE -> new DoctorPneumologie(nume,CNP,notiteConsult);
            default -> null;
        };
    }
}
