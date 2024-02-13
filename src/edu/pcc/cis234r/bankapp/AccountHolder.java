package edu.pcc.cis234r.bankapp;


public class AccountHolder {

    private String name;
    private String city;
    private int checking = 0;
    private int savings = 0;

    /**
     * Create AccountHolder object with given properties
     */
    public AccountHolder(String name, String city, int checking, int savings){
        this.name = name;
        this.city = city;
        this.checking = checking;
        this.savings = savings;
    }
    public void setChecking(int checking) {
        this.checking = checking;
    }
    public void setSavings(int savings) {
        this.savings = savings;
    }
    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }
    public int getChecking() {
        return checking;
    }
    public int getSavings(){
        return savings;
    }
    public void getCheckingInfo(Account account){
        if (account.getAccount_number() == 0) {
            System.out.println("No checking account set up yet.");
        } else {
            System.out.println("Checking Account Number: " + getChecking());
            System.out.println("Balance: $" + account.getBalance());
        }
    }
    public void getSavingsInfo(Account account){
        if (savings == 0) {
            System.out.println("No savings account set up yet.");
        } else {
            System.out.println("Savings Account Number: " + getSavings());
            System.out.println("Savings Balance: $" + account.getAccount_number());
        }
    }
}
