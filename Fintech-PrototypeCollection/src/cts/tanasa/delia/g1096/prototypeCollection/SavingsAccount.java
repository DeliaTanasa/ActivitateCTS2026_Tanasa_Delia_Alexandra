package cts.tanasa.delia.g1096.prototypeCollection;

import java.util.ArrayList;
import java.util.List;

public class SavingsAccount extends Account implements Cloneable{
    private int perioada;
    private double dobanda;

    public SavingsAccount(double balance, String holderName, List<Double> transactionHistory, int perioada, double dobanda) {
        super(balance);
        this.holderName = holderName;
        this.transactionHistory =new ArrayList<>(transactionHistory);
        this.perioada = perioada;
        this.dobanda = dobanda;
    }

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void generateAccountStatement() {
        System.out.println("SavingsAccount{" +
                "holderName='" + holderName + '\'' +
                ", balance=" + balance +
                ", transactionHistory=" + transactionHistory +
                ", perioada=" + perioada +
                ", dobanda=" + dobanda +
                '}');
    }

    public void setPerioada(int perioada) {
        this.perioada = perioada;
    }

    public void setTransactionHistory(List<Double> transactionHistory) {
        this.transactionHistory = new ArrayList<>(transactionHistory); // Deep Copy!
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new SavingsAccount(balance,holderName,transactionHistory,perioada,dobanda);
    }
}
