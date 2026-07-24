import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {

    private String owner;
    private double balance;
    private String accountNumber;

    private List<Transaction> transactions = new ArrayList<>();

    public BankAccount(String owner,
                       double balance,
                       String accountNumber) {

        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;

        transactions.add(
                new Transaction(
                        "ACCOUNT CREATED",
                        balance,
                        "Opening balance"));
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }

        balance += amount;

        transactions.add(
                new Transaction(
                        "DEPOSIT",
                        amount,
                        "Cash deposit"));

        System.out.println("Deposit successful.");
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }

        balance -= amount;

        transactions.add(
                new Transaction(
                        "WITHDRAWAL",
                        amount,
                        "Cash withdrawal"));

        System.out.println("Withdrawal successful.");
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void printTransactionHistory() {

        System.out.println();
        System.out.println("===== Transaction History =====");

        for (Transaction transaction : transactions) {

            transaction.printStatement();

        }
    }

    public void printDetails() {

        System.out.println("----------------------------");
        System.out.println("Account Type : " + getAccountType());
        System.out.println("Owner        : " + owner);
        System.out.println("Account No   : " + accountNumber);
        System.out.println("Balance      : $" + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract String getAccountType();
}