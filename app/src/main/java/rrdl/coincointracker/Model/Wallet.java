package rrdl.coincointracker.Model;

/**
 * Created by moneem on 16/03/18.
 */

public class Wallet {
    double balance;


    public Wallet(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void withdraw(double sum){
        this.balance=balance-sum;

    }
    public void deposit(double sum){
        this.balance=balance+sum;

    }


}
