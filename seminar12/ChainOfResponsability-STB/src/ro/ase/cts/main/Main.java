package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        CalatorieHandler calatorieAutobuz=new CalatorieAutobuz();
        CalatorieHandler calatorieTroleibuz=new CalatorieTroleibuz();
        CalatorieHandler calatorieTramvai=new CalatorieTramvai();
        CalatorieHandler calatorieMetrou=new CalatorieMetrou();
        calatorieTroleibuz.setSuccesor(calatorieAutobuz);
        calatorieAutobuz.setSuccesor(calatorieTramvai);
        calatorieTramvai.setSuccesor(calatorieMetrou);

        System.out.println(calatorieTroleibuz.recomandariCalatoerie(5));
        System.out.println(calatorieTroleibuz.recomandariCalatoerie(12));
        System.out.println(calatorieTroleibuz.recomandariCalatoerie(2));
        System.out.println(calatorieTroleibuz.recomandariCalatoerie(4));
    }
}
