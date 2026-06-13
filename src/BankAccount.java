public class BankAccount {
    private String owner;
    private double balance;
    private String accountNumber;

    public BankAccount(String owner, double balance , String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }

        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Deposit successful.");
            return;
        }

        balance -= amount;
    }

    public String getAccountNumber() {
        if(accountNumber == null) {
            System.out.println("Account number not set");
        }
        return accountNumber;
    }

    public void printDetails() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: $" + balance);
        System.out.println("Account number: " + accountNumber);
    }
}
