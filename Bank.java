 package banking;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();

    private int accountNumber = 1001;

    // Constructor
    public Bank() {

    }

    public void createSavingsAccount(double balance) {

        Account a = new SavingsAccount(accountNumber, balance);

        accounts.add(a);

        System.out.println("Savings account created");
        System.out.println("Account Number: " + accountNumber);

        accountNumber++;
    }

    public void createCurrentAccount(double balance) {

        Account a = new CurrentAccount(accountNumber, balance);

        accounts.add(a);

        System.out.println("Current account created");
        System.out.println("Account Number: " + accountNumber);

        accountNumber++;
    }

    public Account findAccount(int number) {

        for (Account a : accounts) {

            if (a.getAccountNumber() == number) {
                return a;
            }
        }

        return null;
    }
}

