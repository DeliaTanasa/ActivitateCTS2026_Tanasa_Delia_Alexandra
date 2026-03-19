package ro.ase.cts.builder02;

public class InternareBuilder02 implements AbstractBuilder02{
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halat;

    public InternareBuilder02() {
        this.patRabatabil = false;
        this.micDejunInclus = false;
        this.papuciCamera = false;
        this.halat = false;
    }

    @Override
    public Internare build(String nume) {
        return new Internare(nume,patRabatabil,micDejunInclus,papuciCamera,halat);
    }

    @Override
    public AbstractBuilder02 setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil=patRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder02 setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus=micDejunInclus;
        return this;
    }

    @Override
    public AbstractBuilder02 setArePapuciCamera(boolean papuciCamera) {
        this.papuciCamera=papuciCamera;
        return this;
    }

    @Override
    public AbstractBuilder02 setAreHalat(boolean halat) {
        this.halat=halat;
        return this;
    }
}
