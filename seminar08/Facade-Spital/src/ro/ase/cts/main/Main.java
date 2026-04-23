package ro.ase.cts.main;

import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.Salon;
import ro.ase.cts.clase.SpitalFacade;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ana", 7);
        Medic medic = new Medic();
        Salon salon = new Salon();

        if (pacient.getGravitate()>4) {
            if (medic.areInregistratPacientul(pacient)){
                int patLiber = salon.getPatLiber();
                if (patLiber!=-1){
                    System.out.println("Pacienta " + pacient.getNume() + " este internata in patul " + patLiber);
                    salon.ocupaPat(patLiber);
                }
            }
        }
        Pacient pacient1 = new Pacient("Ion", 2);
        Pacient pacient2 = new Pacient("Miruna", 9);
        Pacient pacient3 = new Pacient("Denisa", 6);

        SpitalFacade spital = new SpitalFacade(medic, salon);
        spital.internarePacient(pacient1);
        spital.internarePacient(pacient2);
        spital.internarePacient(pacient3);

    }
}
