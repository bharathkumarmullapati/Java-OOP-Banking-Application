package banking;

	public class CurrentAccount extends Account {

	    public CurrentAccount(int accountNumber, double balance) {
	        super(accountNumber, balance);
	    }

	    @Override
	    public void withdraw(double amount) {

	        if (amount > 0 && amount <= getBalance() + 1000) {

	            deduct(amount);

	            System.out.println("Withdrawal successful");

	        } else {

	            System.out.println("Overdraft limit exceeded");
	        }
	    }
	}

