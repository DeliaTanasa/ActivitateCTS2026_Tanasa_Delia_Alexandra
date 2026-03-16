package ro.ase.cts.singleton.lazySingleton;

public class Hotel {
    private static Hotel instanta=null;
    private String denumireHotel;
    private int numarCamere;
    private int nrCamereInchiriate;
    private int numarAngajati;


    private Hotel() {
    }

    private Hotel(String denumireHotel, int numarCamere, int numarAngajati) {
        this.denumireHotel = denumireHotel;
        this.numarCamere = numarCamere;
        this.nrCamereInchiriate=0;
        this.numarAngajati = numarAngajati;
    }

    public void afisareInchiriereCamera(){
        if(nrCamereInchiriate==numarCamere){
            System.out.println("Nu mai sunt camere disponibile");
        }
        else{
            System.out.println("Camera a fost inchiriata cu succes!");
            nrCamereInchiriate++;
        }
    }

    public void afisareDescriere(){
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.append(denumireHotel,numarCamere,numarAngajati));

    }

    //cu synchtonized e singletone threadsafe
    public static synchronized Hotel getInstance(String denumireHotel,int numarCamere, int numarAngajati){
        if(instanta==null){
            instanta=new Hotel(denumireHotel,numarCamere,numarAngajati);
        }
        return instanta;
    }
}
