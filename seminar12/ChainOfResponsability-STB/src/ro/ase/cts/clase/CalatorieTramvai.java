package ro.ase.cts.clase;

public class CalatorieTramvai extends CalatorieHandler{
    @Override
    public String recomandariCalatoerie(double distanta) {
        if(distanta<10){
            return "Tramvai";
        }
        else{
            return super.succesor.recomandariCalatoerie(distanta);
        }
    }
}
