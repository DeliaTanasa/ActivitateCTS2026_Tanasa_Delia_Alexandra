package ro.ase.cts.clase;

public class ComandaOcupare implements Command{
    private Restaurant restaurant;

    public ComandaOcupare(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void executa() {
        restaurant.ocupaMasa();
    }
}
