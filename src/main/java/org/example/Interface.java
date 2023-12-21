package org.example;

interface IBank{
    default void welcome(){
        System.out.println("Welcome to IBank");
    }
    void openAccount();
    void closeAccount();
}
interface IABCBank{
    void deposit();
    void withdraw();
    void balance();
}

class Saving implements IABCBank , IBank{
    @Override
    public void deposit() {
        System.out.println("Deposit in Saving...");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw from Saving...");
    }

    @Override
    public void balance() {
        System.out.println("Balance in Saving...");
    }

    @Override
    public void openAccount() {
        System.out.println("Open Account");
    }

    @Override
    public void closeAccount() {
        System.out.println("Close Account");
    }
}
public class Interface {
    public static void main(String[] arg){
        Saving saving= new Saving();
        saving.welcome();
        saving.openAccount();
        saving.deposit();
        saving.balance();
        saving.withdraw();
        saving.closeAccount();

    }
}
