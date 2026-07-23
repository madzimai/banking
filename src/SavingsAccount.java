public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(
            String owner,
            double balance,
            String accountNumber,
            double interestRate) {

        super(owner, balance, accountNumber);

        this.interestRate = interestRate;
    }

    public void addInterest() {

        double interest =
                getBalance() * interestRate;

        deposit(interest);

        System.out.println(
                "Interest added: $" + interest);
    }
}