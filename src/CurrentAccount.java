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

    }

    private void setBalance(double v) {
    }
    @Override
    public String getAccountType() {
        return "Current Account";
    }
}
