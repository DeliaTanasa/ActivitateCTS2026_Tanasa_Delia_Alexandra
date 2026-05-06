package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> listaComenzi=new ArrayList<>();

    public Operator() {
    }

    public Operator(List<Command> listaComenzi) {
        this.listaComenzi = listaComenzi;
    }
    public void adaugaComanda(Command command){
        listaComenzi.add(command);
    }
    public void executaComanda(){
        if(listaComenzi.size()>0){
            listaComenzi.get(0).pleacaInCursa();
            listaComenzi.remove(0);
        }
    }
}
