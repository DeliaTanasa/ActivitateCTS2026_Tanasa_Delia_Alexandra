package ro.ase.cts.main;

import ro.ase.cts.clase.FacadeAutobuz;

public class Main {
    public static void main(String[] args) {
        FacadeAutobuz autobuz=new FacadeAutobuz();
        autobuz.deschidereUsiFortat();
        System.out.println();
        autobuz.deschidereUsiLiber();
    }
}
