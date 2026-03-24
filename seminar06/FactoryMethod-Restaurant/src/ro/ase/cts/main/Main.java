package ro.ase.cts.main;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.Supa;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipSupa;
import ro.ase.cts.fabrici.FabricaDesert;
import ro.ase.cts.fabrici.FabricaFelDeMancare;
import ro.ase.cts.fabrici.FabricaSupe;

public class Main {
    public static void main(String[] args) {
        FabricaFelDeMancare fabricaFelDeMancare=new FabricaSupe();
        FelDeMancare supaDeCiuperci=fabricaFelDeMancare.creareFelDeMancare(TipSupa.SupaDeCiuperci,200,23);
        FelDeMancare supaDeLegume= fabricaFelDeMancare.creareFelDeMancare(TipSupa.SupaDeLegume,400,31);

        fabricaFelDeMancare=new FabricaDesert();
        FelDeMancare clatite= fabricaFelDeMancare.creareFelDeMancare(TipDesert.Clatite,200,50,900);
        FelDeMancare papanasi= fabricaFelDeMancare.creareFelDeMancare(TipDesert.Papanasi,350,45,1200);

        supaDeCiuperci.afisareDescriere();
        supaDeLegume.afisareDescriere();
        clatite.afisareDescriere();
        papanasi.afisareDescriere();
    }
}
