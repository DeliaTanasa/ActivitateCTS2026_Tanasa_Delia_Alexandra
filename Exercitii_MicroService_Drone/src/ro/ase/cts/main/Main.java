package ro.ase.cts.main;

import cts.tanasa.delia.g1096.builder.Drone;
import cts.tanasa.delia.g1096.builder.DroneBuilder;
import cts.tanasa.delia.g1096.builder.ExtraBattery;
import cts.tanasa.delia.g1096.singletonRegistry.*;

public class Main {
    public static void main(String[] args) throws Exception {
        AbstractMicroService service1=new ServiciuUtilizatori("serviciu1","url1");
        AbstractMicroService service2=new ServiciuFabricatie("serviciu2","url2");
        AbstractMicroService service3=new ServiciuMeteo("serviciu3","url3");
        ServiciuRegistry.registry("serviciu1 url1",service1);
        ServiciuRegistry.registry("serviciu2 url2",service2);
        ServiciuRegistry.registry("serviciu3 url3",service3);
        AbstractMicroService s1=ServiciuRegistry.getMicroService("serviciu1 url1");
        AbstractMicroService s2=ServiciuRegistry.getMicroService("serviciu2 url2");
        AbstractMicroService s3=ServiciuRegistry.getMicroService("serviciu3 url3");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1==s2);
        ServiciuRegistry.getMicroService("serviciu1 url1").connect();

        System.out.println("\n Builder:");
        //pt builder
        DroneBuilder droneBuilder=new DroneBuilder();
        Drone drone1=droneBuilder.setExtraBattery(new ExtraBattery("AA","incarca top",10)).setModel("amg").build();
        System.out.println(drone1);
        Drone drone2=droneBuilder.setMaxSpeed(67).build();
        System.out.println(drone2);
    }
}
