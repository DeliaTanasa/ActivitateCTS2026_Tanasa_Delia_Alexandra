package ro.ase.cts.builder02;

import ro.ase.cts.builder02.Internare;

public interface AbstractBuilder02 {
    Internare build(String nume);
    AbstractBuilder02 setPatRabatabil(boolean patRabatabil);
    AbstractBuilder02 setMicDejunInclus(boolean micDejunInclus);
    AbstractBuilder02 setArePapuciCamera(boolean papuciCamera);
    AbstractBuilder02 setAreHalat(boolean halat);


}
