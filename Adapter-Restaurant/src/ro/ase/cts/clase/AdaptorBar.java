package ro.ase.cts.clase;

import ro.ase.cts.clase.PrintareFactura;
import ro.ase.cts.clase.SoftBar;

public class AdaptorBar implements PrintareFactura {
    private SoftBar softBar;

    public AdaptorBar(SoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void afisareDetalii() {
        this.softBar.comanda();
    }
}
