package ro.ase.cts.clase;

public interface SucursalaBanca {
    void descriere();
    void adaugareNod(SucursalaBanca agentieBanca);
    void stergeNod(SucursalaBanca agentieBanca);
    SucursalaBanca getNod(int index);
}
