package ATM;

public class BankAccount {
    int acNo;
    String acName, acPhone, acEmail;
    double acBalance;

    public BankAccount(int acNo, String acName, String acPhone, String acEmail, double acBalance) {
        this.acNo = acNo;
        this.acName = acName;
        this.acPhone = acPhone;
        this.acEmail = acEmail;
        this.acBalance = acBalance;
    }

    public void accountHolder() {
        System.out.println("Account number: " + acNo);
        System.out.println("Account holder Name: " + acName);
        System.out.println("Account holder Address: " + acEmail);
        System.out.println("Account holder Phone: " + acPhone);
        System.out.println("Account holder Balance: " + acBalance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= acBalance) {
            acBalance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal failed. Invalid amount or insufficient balance.");
        }
    }

    public void deposit(double amount) {
        acBalance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void displayBalance() {
        System.out.println("Account Number: " + acNo + "\nBalance: " + acBalance + "\n");
    }
}
