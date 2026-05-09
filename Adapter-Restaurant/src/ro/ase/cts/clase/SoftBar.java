package ro.ase.cts.clase;

public class SoftBar {
    private int nrFactura;
    private int nrBauturi;
    private double pretFactura;

    public SoftBar(int nrFactura,int nrBauturi, double pretFactura) {
        this.nrFactura=nrFactura;
        this.nrBauturi = nrBauturi;
        this.pretFactura = pretFactura;
    }

    public void comanda(){
        System.out.println("Factura cu numarul "+this.nrFactura+" contine "+this.nrBauturi+" bauturi si are pretul de "+this.pretFactura);
    }
}
