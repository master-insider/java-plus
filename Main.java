import ATM.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingAccount savingsAccount = new SavingAccount(101, "John Wachira", "0710100100", "john12@gmail.com", 1000);
        CurrentAccount currentAccount = new CurrentAccount(1002, "Jane Wachira", "0724161651", "jane12@gmail.com", 1000);

        boolean exit = false;

        while (!exit) {
            System.out.println("Select an option:");
            System.out.println("1. Deposit to Savings Account");
            System.out.println("2. Withdraw from Savings Account");
            System.out.println("3. Check Savings Account Balance");
            System.out.println("4. Deposit to Current Account");
            System.out.println("5. Withdraw from Current Account");
            System.out.println("6. Check Current Account Balance");
            System.out.println("7. Transfer Funds between Accounts");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the deposit amount for Savings Account: ");
                    double depositAmount = scanner.nextDouble();
                    savingsAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the withdrawal amount from Savings Account: ");
                    double withdrawalAmount = scanner.nextDouble();
                    savingsAccount.withdraw(withdrawalAmount);
                    break;
                case 3:
                    savingsAccount.displayBalance();
                    break;
                case 4:
                    System.out.print("Enter the deposit amount for Current Account: ");
                    depositAmount = scanner.nextDouble();
                    currentAccount.deposit(depositAmount);
                    break;
                case 5:
                    System.out.print("Enter the withdrawal amount from Current Account: ");
                    withdrawalAmount = scanner.nextDouble();
                    currentAccount.withdraw(withdrawalAmount);
                    break;
                case 6:
                    currentAccount.displayBalance();
                    break;
                case 7:
                    System.out.print("Enter the transfer amount: ");
                    double transferAmount = scanner.nextDouble();
                    FundTransfer.transferFunds(savingsAccount, currentAccount, transferAmount);
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}
