package ro.ase.cts.clase;

public class ComandaRezervare implements Command{
    private Restaurant restaurant;

    public ComandaRezervare(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void executa() {
        restaurant.rezervaMasa();
    }
}
