package edu.pcc.cis234r.bankapp;

public class Account {

    private int account_number;
    private final String type;
    private double balance;

    /**
     * Create an Account object with given properties
     */
    public Account(int account_number, String type, double balance) {
        this.account_number = account_number;
        this.type = type;
        this.balance = balance;
    }

    public double get_balance(){
        return balance;
    }
    public int get_account_number(){
        return account_number;
    }
    public String get_type(){
        return type;
    }

    private void set_balance(double balance){
        this.balance = balance;
    }
    private void set_account_number(int account_number) {
        this.account_number = account_number;
    }
    public void withdrawl(Account account, double amount){
        balance = account.get_balance() - amount;
    }
    public void deposit(Account account, double amount){
        balance = account.get_balance() + amount;
    }
}
