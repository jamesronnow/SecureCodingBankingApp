package edu.pcc.cis234r.bankapp;

public class AccountHolder {

    private final String name;
    private final String city;
    private int checking;
    private int savings;

    /**
     * Create AccountHolder object with given properties
     */
    public AccountHolder(String name, String city, int checking, int savings) {
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

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void getAccountInfo(Account account) {
        if (checking == 0) {
            System.out.println("No checking account set up yet.");
        } else if (savings == 0) {
            System.out.println("No savings account set up yet.");
        } else {
            System.out.println(account.get_type() + " Account Number: " + account.get_account_number());
            System.out.println(account.get_type() + " Account Balance: " + account.get_balance());
        }
    }
}