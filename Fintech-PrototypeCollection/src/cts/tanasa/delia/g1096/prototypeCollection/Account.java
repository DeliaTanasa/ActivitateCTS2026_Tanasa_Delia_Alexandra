package cts.tanasa.delia.g1096.prototypeCollection;

import java.util.List;

public abstract class Account {
    protected String holderName;
    protected double balance;
    protected List<Double> transactionHistory;

    public Account(double balance) {
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public abstract void generateAccountStatement();
}
