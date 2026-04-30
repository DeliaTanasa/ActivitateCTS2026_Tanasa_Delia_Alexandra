package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.AutobuzCursaSpeciala;
import ro.ase.cts.clase.AutobuzDeNoapte;
import ro.ase.cts.clase.MijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport mijlocDeTransport= new Autobuz("167",20);

        mijlocDeTransport.opresteInStatie();
        mijlocDeTransport.opresteInStatie();

        MijlocDeTransport autobuzDeNoapte=new AutobuzDeNoapte(mijlocDeTransport);
        autobuzDeNoapte.opresteInStatie();

        MijlocDeTransport autobuz2=new Autobuz("62",0);
        MijlocDeTransport autobuzDeNoapte2=new AutobuzDeNoapte(autobuz2);
        autobuz2.opresteInStatie();
        autobuzDeNoapte2.opresteInStatie();

        MijlocDeTransport autobuz3=new Autobuz("62Speciala",0);
        MijlocDeTransport autobuz4=new AutobuzCursaSpeciala(autobuz3);
        autobuz4.opresteInStatie();
    }
}
