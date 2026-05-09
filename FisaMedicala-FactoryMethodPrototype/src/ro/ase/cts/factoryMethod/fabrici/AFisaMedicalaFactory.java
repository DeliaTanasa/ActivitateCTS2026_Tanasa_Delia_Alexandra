package ro.ase.cts.factoryMethod.fabrici;

import ro.ase.cts.factoryMethod.clase.AFisaMedicala;
import ro.ase.cts.factoryMethod.enums.TipSectie;

public interface AFisaMedicalaFactory {
    AFisaMedicala creareFisaMedicala(TipSectie tipSectie,String nume,int[] CNP);
    AFisaMedicala creareFisaMedicala(TipSectie tipSectie,String nume,int[] CNP,String notiteConsult);

}
