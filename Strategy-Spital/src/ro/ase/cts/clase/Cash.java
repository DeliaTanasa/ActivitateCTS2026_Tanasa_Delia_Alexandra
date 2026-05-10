package ro.ase.cts.clase;

public class Cash implements ModPlata{
    @Override
    public void plateste(String nume, double suma) {
        System.out.println(nume+" plateste consulatia care costa "+suma+" lei, cash");
    }
}
