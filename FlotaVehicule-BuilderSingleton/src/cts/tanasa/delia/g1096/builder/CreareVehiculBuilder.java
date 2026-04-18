package cts.tanasa.delia.g1096.builder;

public class CreareVehiculBuilder {
    private int nrVehicule;
    private TipMotor tipMotor;
    private int capacitateBaterie;
    private boolean areSenzoriLidar;
    private String camera;
    private String GPS;
    private int capacitateIncarcare;
    private NivelAutonomie nivelAutonomie;

    public CreareVehicul build(){
        if(tipMotor==TipMotor.ELECTRIC && nivelAutonomie==NivelAutonomie.L5){
            throw  new RuntimeException("Nu se poate crea un vehicul electric cu autonomie L5");
        }
        else{
            CreareVehicul creareVehicul=new CreareVehicul(nrVehicule,tipMotor,capacitateBaterie,areSenzoriLidar,camera,GPS,capacitateIncarcare,nivelAutonomie);
            this.nrVehicule=0;
            this.tipMotor=null;
            this.capacitateBaterie=0;
            this.areSenzoriLidar=false;
            this.camera="";
            this.GPS="";
            this.capacitateIncarcare=0;
            this.nivelAutonomie=null;
            return creareVehicul;
        }

    }

    public CreareVehiculBuilder() {
        this.nrVehicule=0;
        this.tipMotor=null;
        this.capacitateBaterie=0;
        this.areSenzoriLidar=false;
        this.camera="";
        this.GPS="";
        this.capacitateIncarcare=0;
        this.nivelAutonomie=null;
    }



    public CreareVehiculBuilder setNrVehicule(int nrVehicule) {
        this.nrVehicule = nrVehicule;
        return this;
    }

    public CreareVehiculBuilder setTipMotor(TipMotor tipMotor) {
        this.tipMotor = tipMotor;
        return this;
    }

    public CreareVehiculBuilder setCapacitateBaterie(int capacitateBaterie) {
        this.capacitateBaterie = capacitateBaterie;
        return this;
    }

    public CreareVehiculBuilder setAreSenzoriLidar(boolean areSenzoriLidar) {
        this.areSenzoriLidar = areSenzoriLidar;
        return this;
    }

    public CreareVehiculBuilder setCamera(String camera) {
        this.camera = camera;
        return this;
    }

    public CreareVehiculBuilder setGPS(String GPS) {
        this.GPS = GPS;
        return this;
    }

    public CreareVehiculBuilder setCapacitateIncarcare(int capacitateIncarcare) {
        this.capacitateIncarcare = capacitateIncarcare;
        return this;
    }

    public CreareVehiculBuilder setNivelAutonomie(NivelAutonomie nivelAutonomie) {
        this.nivelAutonomie = nivelAutonomie;
        return this;
    }
}
