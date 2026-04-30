package ro.ase.cts.main;

import ro.ase.cts.clase.Departament;
import ro.ase.cts.clase.Sectie;
import ro.ase.cts.clase.Structura;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Structura depAdministrativ = new Departament("Administrativ");
        Structura depSpital = new Departament("Spital");
        Structura sectieSecretariat = new Sectie("Secretariat", 20);
        Structura sectieManagement = new Sectie("Management", 14);

        ((Departament) depSpital).adaugaStructura(depAdministrativ);
        ((Departament) depSpital).adaugaStructura(sectieManagement);
        ((Departament) depAdministrativ).adaugaStructura(sectieSecretariat);

        depSpital.afiseazaDetaliiStructura(" ");

        ((Departament) depSpital).stergeStructura(sectieManagement);
        ((Departament) depAdministrativ).stergeStructura(sectieManagement);

        System.out.println("Dupa modificare: \n");
        depSpital.afiseazaDetaliiStructura(" ");

    }
}
