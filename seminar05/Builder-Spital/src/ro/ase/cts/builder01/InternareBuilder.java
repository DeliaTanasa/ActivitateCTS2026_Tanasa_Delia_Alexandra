package ro.ase.cts.builder01;

public class InternareBuilder implements AbstractBuilder{
    private Internare internare;

    public InternareBuilder(String numePacient) {
        this.internare=new Internare(numePacient,false,false,false,false);
    }

    @Override
    public Internare build() {
        return this.internare;
    }

    @Override
    public AbstractBuilder setNume(String numePacient) {
        this.internare.setNumePacient(numePacient);
        return this;
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean patRabatabil) {
        this.internare.setPatRabatabil(patRabatabil);
        return this;
    }

    @Override
    public AbstractBuilder setMicDejunInclus(boolean micDejunInclus) {
        this.internare.setMicDejunInclus(micDejunInclus);
        return this;
    }

    @Override
    public AbstractBuilder setArePapuciCamera(boolean papuciCamera) {
        this.internare.setPapuciCamera(papuciCamera);
        return this;
    }

    @Override
    public AbstractBuilder setAreHalat(boolean halat) {
        this.internare.setHalat(halat);
        return this;
    }
}
