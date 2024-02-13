package edu.pcc.cis234r.bankapp;

public class Main {
    public static void main(String[] args) {

        AccountHolder account_holder = new AccountHolder("James", "Sandy", 0, 0);
        Account checking_account = new Account(12345, "Checking", 999.99);
        Account savings_account = new Account(22345, "Savings", 899.00);

        System.out.println("Welcome " + account_holder.getName() + "!\n");

        account_holder.getAccountInfo(checking_account);
        account_holder.getAccountInfo(savings_account);

        account_holder.setChecking(checking_account.get_account_number());
        account_holder.setSavings(savings_account.get_account_number());

        System.out.println("------------------");

        account_holder.getAccountInfo(checking_account);
        account_holder.getAccountInfo(savings_account);

        checking_account.deposit(checking_account, 1000.00);
        checking_account.deposit(checking_account, 2500.00);
        checking_account.withdrawl(checking_account, 50.00);
        savings_account.withdrawl(savings_account, 500.00);
        savings_account.withdrawl(savings_account, 30.00);
        savings_account.deposit(savings_account, 500.00);

        System.out.println("------------------");

        account_holder.getAccountInfo(checking_account);
        account_holder.getAccountInfo(savings_account);
    }
}
