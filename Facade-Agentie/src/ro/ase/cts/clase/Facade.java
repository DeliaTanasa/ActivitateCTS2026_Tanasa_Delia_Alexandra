package ro.ase.cts.clase;

public class Facade {
    public void rezervaPachetCazareTransport(String orasPlecare, String orasDestinatie,String tipBilet) {
    Zbor zborDus = new Zbor(orasPlecare, orasDestinatie, tipBilet);
    Hotel hotel = new Hotel("Hillton");
    Zbor zborIntors = new Zbor(orasDestinatie, orasPlecare, tipBilet);
    zborDus.rezervaZborDus();
    zborIntors.rezervaZborIntors();
    hotel.rezervaCamera(orasDestinatie);

    }
}
