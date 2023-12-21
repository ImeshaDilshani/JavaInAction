package org.example;

abstract class  ABCBankAccount{
    abstract void openAccount();
    abstract void closeAccount();
}
abstract class BankAccount extends  ABCBankAccount{
    abstract void deposit();
    abstract void withdrawal();
    abstract void balance();


}

class SavingAccount extends BankAccount{

    @Override
    void deposit() {
        System.out.println("Deposit in saving account....");
    }

    @Override
    void withdrawal() {
        System.out.println("Withdrawal from saving account....");
    }

    @Override
    void balance() {
        System.out.println("Balance in saving account....");
    }

    @Override
    void openAccount() {
        System.out.println("Open Account");
    }

    @Override
    void closeAccount() {
        System.out.println("Close Account");
    }
}

class CurrentAccount extends BankAccount{
    @Override
    void deposit() {
        System.out.println("Deposit in current account....");
    }

    @Override
    void withdrawal() {
        System.out.println("Withdrawal from current account....");
    }

    @Override
    void balance() {
        System.out.println("Balance in current account....");
    }
    @Override
    void openAccount() {
        System.out.println("Open Account");
    }

    @Override
    void closeAccount() {
        System.out.println("Close Account");
    }
}
public class Abstraction {
    public static void main(String[] arg){
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.openAccount();
        savingAccount.balance();
        savingAccount.withdrawal();
        savingAccount.deposit();
        savingAccount.closeAccount();

        System.out.println("-------------------------------------");

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.openAccount();
        currentAccount.balance();
        currentAccount.withdrawal();
        currentAccount.deposit();
        currentAccount.closeAccount();
    }
}
