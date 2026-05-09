package ro.ase.cts.main;

import ro.ase.cts.clase.AdaptorMetrou;
import ro.ase.cts.clase.Metrou;
import ro.ase.cts.clase.ValidatorTransport;

public class Main {
    public static void main(String[] args) {
        Metrou metrou=new Metrou("Anual","O calatorie",160,5);
        ValidatorTransport validatorTransport=new AdaptorMetrou(metrou);
        validatorTransport.validareAbonament();
        validatorTransport.validareBilet();
    }
}
