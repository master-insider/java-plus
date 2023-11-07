package ATM;

public class FundTransfer {
    public static void transferFunds(BankAccount sourceAccount, BankAccount destinationAccount, double amount) {
        if (amount > 0 && sourceAccount.acBalance >= amount) {
            sourceAccount.acBalance -= amount;
            destinationAccount.acBalance += amount;
            System.out.println("Transferred " + amount + " from " + sourceAccount.acName + " to " + destinationAccount.acName);
        } else {
            System.out.println("Transfer failed. Invalid amount or insufficient balance.");
        }
    }
}
