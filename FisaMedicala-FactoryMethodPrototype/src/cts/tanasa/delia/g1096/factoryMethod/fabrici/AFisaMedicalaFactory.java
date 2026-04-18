package cts.tanasa.delia.g1096.factoryMethod.fabrici;

import cts.tanasa.delia.g1096.factoryMethod.clase.AFisaMedicala;
import cts.tanasa.delia.g1096.factoryMethod.enums.TipSectie;

public interface AFisaMedicalaFactory {
    AFisaMedicala creareFisaMedicala(TipSectie tipSectie,String nume,int[] CNP);
    AFisaMedicala creareFisaMedicala(TipSectie tipSectie,String nume,int[] CNP,String notiteConsult);

}
