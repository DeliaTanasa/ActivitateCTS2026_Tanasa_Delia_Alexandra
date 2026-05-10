package ro.ase.cts.clase;

public interface FlotaCompanie {
    void descriere();
    void adaugaNod(FlotaCompanie flotaCompanie);
    void stergeNod(FlotaCompanie flotaCompanie);
    FlotaCompanie getNotCopil(int index);
}
