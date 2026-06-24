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
}