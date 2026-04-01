package g1096.builder;

public class DroneBuilder {
    private String model;
    private String softwareVersion;
    private float maxSpeed;
    private AbstractModule extraBattery;

    public Drone build(){
        Drone drone = new Drone(model,softwareVersion,maxSpeed,extraBattery);
        this.model="";
        this.softwareVersion="";
        this.maxSpeed=0;
        this.extraBattery=null;
        return drone;
    }

    public DroneBuilder() {
        this.model="";
        this.softwareVersion="";
        this.maxSpeed=0;
        this.extraBattery=null;
    }

    //aici e de adaugat deci in loc de set pot pune add
    public DroneBuilder setModel(String model) {
        this.model = model;
        return this;

    }

    public DroneBuilder setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
        return this;
    }

    public DroneBuilder setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public DroneBuilder setExtraBattery(AbstractModule extraBattery) {
        this.extraBattery = extraBattery;
        return this;
    }
}
