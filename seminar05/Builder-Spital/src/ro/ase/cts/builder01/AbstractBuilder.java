package ro.ase.cts.builder01;

public interface AbstractBuilder {
    Internare build();

    AbstractBuilder setNume(String numePacient);
    AbstractBuilder setPatRabatabil(boolean patRabatabil);
    AbstractBuilder setMicDejunInclus(boolean micDejunInclus);
    AbstractBuilder setArePapuciCamera(boolean papuciCamera);
    AbstractBuilder setAreHalat(boolean halat);


}
