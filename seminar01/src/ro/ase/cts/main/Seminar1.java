package ro.ase.cts.main;

import ro.ase.cts.animale.Lion;
import ro.ase.cts.animale.Vidra;
import ro.ase.cts.animale.Zebra;
import ro.ase.cts.zoo.ZOO;
import ro.ase.cts.zoo.ZooKeeper;

public class
Seminar1 {
    public static void main(String args[]){
        ZooKeeper zooKeeper=new ZooKeeper(
                "Popescu"
        );
        ZOO zoo=new ZOO("Baneasa",zooKeeper);
        zoo.addAnimal(new Lion("Leul1",2,"carne",100));
        zoo.addAnimal(new Lion("Leul2",5,"carne",150));
        zoo.addAnimal(new Zebra("Zebra1",1,"iarba",99));
        zoo.addAnimal(new Zebra("Zebra2",2,"fan",200));
        zoo.addAnimal(new Vidra("Vidra1",7,"peste","balta"));

        zoo.feedAllAnimals();
    }
}
