package ro.ase.cts.clase;

public class InternarePacient implements Spital{
    private Pacient pacient;

    public InternarePacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void internare() {
        System.out.println("Pacientul a fost internat cu succes");
    }
}
