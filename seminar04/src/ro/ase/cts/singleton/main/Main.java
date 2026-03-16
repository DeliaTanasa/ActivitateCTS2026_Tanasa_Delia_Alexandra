package ro.ase.cts.singleton.main;

import ro.ase.cts.singleton.lazySingleton.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1= Hotel.getInstance("Hotelul 1",2,4);
        Hotel hotel2= Hotel.getInstance("Hotelul 2",6,20);

        hotel1.afisareInchiriereCamera();
        hotel1.afisareInchiriereCamera();

        hotel2.afisareInchiriereCamera();
        hotel2.afisareInchiriereCamera();


    }
}
