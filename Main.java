
	
package banking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {

            System.out.println("\n===== BANKING SYSTEM =====");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. View Balance");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1 || choice == 2) {

                System.out.print("Enter initial balance: ");
                double balance = sc.nextDouble();

                if (balance < 0 || (choice == 1 && balance < 500)) {
                    System.out.println("Invalid opening balance");
                } else if (choice == 1) {
                    bank.createSavingsAccount(balance);
                } else {
                    bank.createCurrentAccount(balance);
                }

            } else if (choice >= 3 && choice <= 5) {

                System.out.print("Enter account number: ");
                int number = sc.nextInt();

                Account a = bank.findAccount(number);

                if (a == null) {
                    System.out.println("Account not found");
                    continue;
                }

                if (choice == 3) {

                    System.out.print("Enter deposit amount: ");
                    double amount = sc.nextDouble();
                    a.deposit(amount);

                } else if (choice == 4) {

                    System.out.print("Enter withdrawal amount: ");
                    double amount = sc.nextDouble();
                    a.withdraw(amount);

                } else if (choice == 5) {

                    System.out.println("Available Balance: " + a.getBalance());
                }

            } else if (choice == 6) {

                System.out.println("Thank you!");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
