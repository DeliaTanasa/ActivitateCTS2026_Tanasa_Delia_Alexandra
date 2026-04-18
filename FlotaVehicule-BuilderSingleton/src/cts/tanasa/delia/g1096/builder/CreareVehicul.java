package cts.tanasa.delia.g1096.builder;


public class CreareVehicul implements ICentru {
    private int nrVehicule;
    private TipMotor tipMotor;
    private int capacitateBaterie;
    private boolean areSenzoriLidar;
    private String camera;
    private String GPS;
    private int capacitateIncarcare;
    private NivelAutonomie nivelAutonomie;

    public CreareVehicul(int nrVehicule, TipMotor tipMotor, int capacitateBaterie, boolean areSenzoriLidar, String camera, String GPS, int capacitateIncarcare,NivelAutonomie nivelAutonomie) {
        this.nrVehicule = nrVehicule;
        this.tipMotor = tipMotor;
        this.capacitateBaterie = capacitateBaterie;
        this.areSenzoriLidar = areSenzoriLidar;
        this.camera = camera;
        this.GPS = GPS;
        this.capacitateIncarcare = capacitateIncarcare;
        this.nivelAutonomie=nivelAutonomie;
    }

    @Override
    public String toString() {
        return "CreareVehicul{" +
                "nrVehicule=" + nrVehicule +
                ", tipMotor=" + tipMotor +
                ", capacitateBaterie=" + capacitateBaterie +
                ", areSenzoriLidar=" + areSenzoriLidar +
                ", camera='" + camera + '\'' +
                ", GPS='" + GPS + '\'' +
                ", capacitateIncarcare=" + capacitateIncarcare +
                ", nivelAutonomie=" + nivelAutonomie +
                '}';
    }

    @Override
    public void inregistreazaVehicul() {
        nrVehicule++;
        System.out.println("Mai sunt "+nrVehicule+" inregistrate");
    }

    @Override
    public void trimiteComanda() {
        nrVehicule--;
        System.out.println("Au mai ramas "+nrVehicule+" vehicule");
    }

    @Override
    public void veziStatus() {
        System.out.println("Comanda care creaza "+nrVehicule+" vehicule ce au urm caracteristici: "+tipMotor+" "+capacitateBaterie+" "+areSenzoriLidar+" "+camera+" "+GPS+" "+capacitateIncarcare+" se creeaza");
    }
}
