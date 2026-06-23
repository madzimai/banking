import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

            List<BankAccount> accounts = new ArrayList<>();

            accounts.add(
                    new BankAccount("Netsai", 500, "ACC001"));

            accounts.add(
                    new BankAccount("Tariro", 100, "ACC0341"));

            accounts.add(
                    new BankAccount("John", 150, "ACC001JJ"));

            System.out.println("Total Accounts: "
                    + accounts.size());
        }
    }
