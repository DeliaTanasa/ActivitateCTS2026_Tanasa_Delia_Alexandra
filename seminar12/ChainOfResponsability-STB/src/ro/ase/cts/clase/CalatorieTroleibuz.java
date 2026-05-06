package ro.ase.cts.clase;

public class CalatorieTroleibuz extends CalatorieHandler{

    @Override
    public String recomandariCalatoerie(double distanta) {
        if(distanta<3){
         return "Troleibuz";
        }
        else{
            return super.succesor.recomandariCalatoerie(distanta);
        }
    }
}
