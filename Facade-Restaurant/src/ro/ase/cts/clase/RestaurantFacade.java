package ro.ase.cts.clase;

public class RestaurantFacade {
    private MasaDebarasata masaDebarasata;
    private MasaLibera masaLibera;
    private MasaPregatita masaPregatita;

    public RestaurantFacade() {
        this.masaDebarasata = new MasaDebarasata();
        this.masaLibera = new MasaLibera();
        this.masaPregatita = new MasaPregatita();
    }

    public void verificareMasaPentruNoulClient(int nrMasa){
        if(masaDebarasata.verificareDebarasareMasa(nrMasa)&&masaLibera.verificareMasaEliberata(nrMasa)&&masaPregatita.verificareMasaGataUrmatorulClient(nrMasa)){
            System.out.println("Au fost parcursi toti pasii, iar masa "+nrMasa+" este gata pentru un nou client");
        }
        else{
            System.out.println("Masa "+nrMasa+" nu este gata inca pentru urmatorul client");
        }
    }
}
