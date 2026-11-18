package banking;

	public class SavingsAccount extends Account {

	    public SavingsAccount(int accountNumber, double balance) {
	        super(accountNumber, balance);
	    }

	    @Override
	    public void withdraw(double amount) {

	        if (amount > 0 && getBalance() - amount >= 500) {

	            deduct(amount);

	            System.out.println("Withdrawal successful");

	        } else {

	            System.out.println("Minimum balance of 500 required");
	        }
	    }
	}

