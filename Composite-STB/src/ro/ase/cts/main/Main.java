package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.FlotaCompanie;
import ro.ase.cts.clase.TipAutobuz;

public class Main {
    public static void main(String[] args) {
        FlotaCompanie flote=new TipAutobuz("Flote");
        FlotaCompanie tip=new TipAutobuz("Grup mare");
        FlotaCompanie tip1=new TipAutobuz("Grup mediu");
        FlotaCompanie tip2=new TipAutobuz("Grup mic");

        FlotaCompanie autobuz=new Autobuz("Otokar","autobuz",26);
        FlotaCompanie autocar=new Autobuz("Mercedes","autocar",54);
        FlotaCompanie microbuz=new Autobuz("Mercedes","microbuz",19);

        tip.adaugaNod(autocar);
        tip1.adaugaNod(autobuz);
        tip2.adaugaNod(microbuz);
        flote.adaugaNod(tip);
        flote.adaugaNod(tip1);
        flote.adaugaNod(tip2);
        flote.descriere();
        System.out.println();
        flote.stergeNod(tip1);
        flote.descriere();
    }
}
