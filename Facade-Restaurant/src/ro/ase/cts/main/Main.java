package ro.ase.cts.main;

import ro.ase.cts.clase.RestaurantFacade;

public class Main {
    public static void main(String[] args) {
        RestaurantFacade restaurantFacade=new RestaurantFacade();
        restaurantFacade.verificareMasaPentruNoulClient(7);
    }
}
