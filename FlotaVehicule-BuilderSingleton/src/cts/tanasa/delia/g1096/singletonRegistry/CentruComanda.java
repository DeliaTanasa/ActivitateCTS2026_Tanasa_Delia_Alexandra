package cts.tanasa.delia.g1096.singletonRegistry;

public class CentruComanda implements ICentru{
    private int nrVehicule;
    private String numeOras;
    private int nrComanda;
    private boolean trimisa;

    protected CentruComanda(int nrVehicule, String numeOras, int nrComanda, boolean trimisa) {
        this.nrVehicule = nrVehicule;
        this.numeOras = numeOras;
        this.nrComanda = nrComanda;
        this.trimisa = trimisa;
    }

    @Override
    public void inregistreazaVehicul() {
        System.out.println("Vehiculul a fost inregistrat");
        nrVehicule++;
    }

    @Override
    public void trimiteComanda() {
        System.out.println("Comanda cu numarul "+nrComanda+" a fost trimisa");
    }

    @Override
    public void veziStatus() {
        if(trimisa==true){
            System.out.println("Comanda cu numarul "+nrComanda+" din orasul "+" a fost trimisa");
        }
        else{
            System.out.println("Comanda cu numarul "+nrComanda+" din orasul "+numeOras+" nu a fost trimisa");
        }

    }
}
