package ro.ase.cts.clase;

public class AutobuzCursaSpeciala implements MijlocDeTransport{
    private MijlocDeTransport mijlocDeTransport;

    public AutobuzCursaSpeciala(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    public MijlocDeTransport getMijlocDeTransport() {
        return mijlocDeTransport;
    }

    @Override
    public void opresteInStatie() {
        if(mijlocDeTransport.getLinie().toLowerCase().contains("speciala")){
            System.out.println("Autobuzul este intr o cursa speciala");
        }
        else{
            mijlocDeTransport.opresteInStatie();
        }
    }

    @Override
    public int getNrCalatori() {
        return mijlocDeTransport.getNrCalatori();
    }

    @Override
    public String getLinie() {
        return mijlocDeTransport.getLinie();
    }
}
