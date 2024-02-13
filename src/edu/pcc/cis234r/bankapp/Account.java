package edu.pcc.cis234r.bankapp;

public class Account {

    private int account_number;
    private String type;
    private double balance;

    /**
     * Create an Account object with given properties
     */
    public Account(int account_number, String type, double balance) {
        this.account_number = account_number;
        this.type = type;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }
    public int getAccount_number(){
        return account_number;
    }
    private void setBalance(double balance){
        this.balance = balance;
    }
    public void setAccount_number(int account_number) {
        this.account_number = account_number;

    }
    public double withdrawl(Account account, double amount){
        return balance = account.getBalance() - amount;
    }

    public double deposit(Account account, double amount){
        return balance = account.getBalance() + amount;
    }
}
