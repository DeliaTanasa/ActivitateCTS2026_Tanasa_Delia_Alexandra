package cts.tanasa.delia.g1096.factoryMethod.fabrici;

import cts.tanasa.delia.g1096.factoryMethod.clase.AFisaMedicala;
import cts.tanasa.delia.g1096.factoryMethod.clase.DoctorCardiologie;
import cts.tanasa.delia.g1096.factoryMethod.clase.DoctorNeurologie;
import cts.tanasa.delia.g1096.factoryMethod.clase.DoctorPneumologie;
import cts.tanasa.delia.g1096.factoryMethod.enums.TipDoctorSectie;
import cts.tanasa.delia.g1096.factoryMethod.enums.TipSectie;

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
