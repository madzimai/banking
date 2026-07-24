import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void listAccounts() {

        System.out.println("===== BANK ACCOUNTS =====");

        for (BankAccount account : accounts) {
            account.printDetails();
            System.out.println();
        }
    }

    public BankAccount findAccount(String accountNumber) {

        for (BankAccount account : accounts) {

            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }

        return null;
    }

    public int getTotalAccounts() {
        return accounts.size();
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
    public void transferMoney(String fromAccount,
                              String toAccount,
                              double amount) {

        BankAccount sender = findAccount(fromAccount);
        BankAccount receiver = findAccount(toAccount);

        if (sender == null || receiver == null) {
            System.out.println("Account not found.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid transfer amount.");
            return;
        }

        if (sender.getBalance() < amount) {
            System.out.println("Insufficient funds.");
            return;
        }

        sender.withdraw(amount);
        receiver.deposit(amount);

        sender.addTransaction(
                new Transaction(
                        "TRANSFER OUT",
                        amount,
                        "Transferred to " + receiver.getAccountNumber()));

        receiver.addTransaction(
                new Transaction(
                        "TRANSFER IN",
                        amount,
                        "Received from " + sender.getAccountNumber()));

        System.out.println("Transfer completed successfully.");
    }

    public void applyInterest() {

        System.out.println("Applying interest...");

        for (BankAccount account : accounts) {

            if (account instanceof InterestBearing interestAccount) {

                interestAccount.addInterest();

            }
        }
    }
}
