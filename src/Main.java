import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(
                new BankAccount(
                        "Netsai",
                        500,
                        "ACC001"));

        accounts.add(
                new BankAccount(
                        "Tariro",
                        100,
                        "ACC0341"));

        accounts.add(
                new BankAccount(
                        "John",
                        150,
                        "ACC001JJ"));

        System.out.println("Total Accounts: "
                + accounts.size());


        BankAccount found =
                findAccount(accounts, "ACC0341");

        if (found != null) {
            found.printDetails();
        } else {
            System.out.println("Account not found");
        }
        //if (accounts == null) return;
        transferMoney(accounts, "ACC001", "ACC002", 200);
    }

    public static BankAccount findAccount(
            List<BankAccount> accounts,
            String accountNumber) {

        for (BankAccount account : accounts) {

            if (account.getAccountNumber()
                    .equals(accountNumber)) {

                return account;
            }
        }

        return null;
    }
    public static void transferMoney(
            List<BankAccount> accounts,
            String fromAccount,
            String toAccount,
            double amount) {

        BankAccount from = findAccount(accounts, fromAccount);
        BankAccount to = findAccount(accounts, toAccount);

        if (from == null || to == null) {
            System.out.println("Account not found===");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid transfer amount");
            return;
        }

        if (from.getBalance() < amount) {
            System.out.println("Insufficient funds");
            return;
        }

        from.withdraw(amount);
        to.deposit(amount);

        System.out.println("Transfer successful");
    }
}