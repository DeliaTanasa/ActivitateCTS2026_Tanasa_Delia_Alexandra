package ro.ase.cts.clase;

public class InternareProxy implements Spital{
    private InternarePacient internarePacient;

    public InternareProxy(InternarePacient internarePacient) {
        this.internarePacient = internarePacient;
    }

    public InternarePacient getInternarePacient() {
        return internarePacient;
    }

    public void setInternarePacient(InternarePacient internarePacient) {
        this.internarePacient = internarePacient;
    }

    @Override
    public void internare() {
        if(internarePacient.getPacient().isAreAsigurare()){
            internarePacient.internare();
        }
        else{
            System.out.println("Pacientul "+internarePacient.getPacient().getNume()+" nu poate fi internat intrucat nu are asigurare de sanatate");
        }
    }
}
