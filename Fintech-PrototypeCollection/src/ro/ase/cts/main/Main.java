package ro.ase.cts.main;

import ro.ase.cts.prototypeCollection.PrototypeCollection;
import ro.ase.cts.prototypeCollection.SavingsAccount;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeCollection prototypeCollection = new PrototypeCollection();

        SavingsAccount savingsAccount1= (SavingsAccount) prototypeCollection.getAccount("Annual");
        SavingsAccount savingsAccount2= (SavingsAccount) prototypeCollection.getAccount("Personal");
        SavingsAccount savingsAccount3= (SavingsAccount) savingsAccount1.clone();
        savingsAccount1.generateAccountStatement();
        savingsAccount3.generateAccountStatement();
        System.out.println(savingsAccount1==savingsAccount3);
        savingsAccount2.generateAccountStatement();

        savingsAccount3.setPerioada(6);

        savingsAccount3.generateAccountStatement();
        savingsAccount1.generateAccountStatement();
        SavingsAccount savingsAccount9 = (SavingsAccount) prototypeCollection.getAccount("Personal");
    }
}
