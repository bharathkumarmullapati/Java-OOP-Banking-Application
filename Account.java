package banking;

public abstract class Account {

	    private int accountNumber;
	    private double balance;

	    public Account(int accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    public int getAccountNumber() {
	        return accountNumber;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance = balance + amount;
	            System.out.println("Deposit successful");
	        } else {
	            System.out.println("Invalid amount");
	        }
	    }

	    protected void deduct(double amount) {
	        balance = balance - amount;
	    }

	    public abstract void withdraw(double amount);
	    public void displayBalance() {
	        System.out.println("Available Balance: " + balance);
	    }
	}

