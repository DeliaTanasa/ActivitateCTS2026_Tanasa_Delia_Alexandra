package ro.ase.cts.main;

import ro.ase.cts.clase.NotaDePlata;
import ro.ase.cts.clase.NotaDePlataAbstract;
import ro.ase.cts.decorator.NotaDePlata1Mai;
import ro.ase.cts.decorator.NotaDePlataDecorator;
import ro.ase.cts.decorator.NotaDePlataPrintatNouAn;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaDePlata = new NotaDePlata(150.00f, "12 Ianuraie");
        notaDePlata.printeaza();

        int a=2;
        NotaDePlataDecorator notaDePlataDecorator;
        if (a == 1) {
            notaDePlataDecorator = new NotaDePlataPrintatNouAn(notaDePlata);
        }
        else {
            notaDePlataDecorator = new NotaDePlata1Mai(notaDePlata);
        }

        notaDePlataDecorator.printeaza();

        notaDePlataDecorator.printeazaFelicitare();

    }
}
