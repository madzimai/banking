public class CurrentAccount extends BankAccount {

    private double overdraftLimit;

    public CurrentAccount(
            String owner,
            double balance,
            String accountNumber,
            double overdraftLimit) {

        super(owner, balance, accountNumber);

        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Withdrawal amount must be greater than zero.");
        }

        if (amount > (getBalance() + overdraftLimit)) {
            throw new InsufficientFundsException(
                    "Overdraft limit exceeded.");
        }

        setBalance(getBalance() - amount);

        addTransaction(
                new Transaction(
                        "WITHDRAWAL",
                        amount,
                        "Current Account Withdrawal"));

        System.out.println("Withdrawal successful.");
    }

    private void setBalance(double v) {
    }
    @Override
    public String getAccountType() {
        return "Current Account";
    }
}
