package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{
    private String nume;
    private List<Pacient> listaPacienti=new ArrayList<>();

    public Spital(String nume) {
        this.nume = nume;
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Pacient pacienti:listaPacienti){
            pacienti.receptioneazaNotificare(mesaj+" de la spitalul "+this.nume);
        }
    }

    @Override
    public void aboneazaPacient(Pacient pacient) {
        listaPacienti.add(pacient);
    }

    @Override
    public void dezaboneazaPaient(Pacient pacient) {
        listaPacienti.remove(pacient);
    }

    public void notificaVirus(){
        trimiteMesaj("Exista un virus nou in oras");
    }

    public void notificaEpidemie(){
        trimiteMesaj("Exista o epidemie nationala");
    }
}
