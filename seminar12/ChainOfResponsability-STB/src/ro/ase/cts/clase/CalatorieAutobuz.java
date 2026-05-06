package ro.ase.cts.clase;

public class CalatorieAutobuz extends CalatorieHandler{
    @Override
    public String recomandariCalatoerie(double distanta) {
        if(distanta<5){
            return "Autobuz";
        }
        else{
            return super.succesor.recomandariCalatoerie(distanta);
        }
    }
}
