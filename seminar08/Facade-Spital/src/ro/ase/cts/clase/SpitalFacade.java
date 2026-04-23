package ro.ase.cts.clase;

public class SpitalFacade {
    private Medic medic;
    private Salon salon;

    public SpitalFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void internarePacient(Pacient pacient){
        if(pacient.getGravitate()>4){
            if (medic.areInregistratPacientul(pacient)){
                int patLiber = salon.getPatLiber();
                if (patLiber!=-1){
                    System.out.println("Pacienta " + pacient.getNume() + " este internata in patul " + patLiber);
                    salon.ocupaPat(patLiber);
                }
                else {
                    System.out.println("Nu sunt paturi libere");
                }
            }
            else {
                System.out.println("Trebuie trimitere de la medic");
            }
        }
        else {
            System.out.println("Nu e atat de grav");
        }
    }
}
