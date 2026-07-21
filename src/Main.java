public class Main {

    public static void main(String[] args) {

        // Create the bank
        Bank bank = new Bank();

        // Add accounts
        bank.addAccount(
                new BankAccount(
                        "Netsai",
                        500,
                        "ACC001"));

        bank.addAccount(
                new BankAccount(
                        "Tariro",
                        600,
                        "ACC0341"));

        bank.addAccount(
                new BankAccount(
                        "John",
                        150,
                        "ACC001JJ"));

        // Display total accounts
        System.out.println("Total Accounts: "
                + bank.getTotalAccounts());

        System.out.println();

        // Display all accounts
        bank.listAccounts();

        // Search for an account
        System.out.println("===== SEARCH ACCOUNT =====");

        BankAccount found =
                bank.findAccount("ACC0341");

        if (found != null) {
            found.printDetails();
        } else {
            System.out.println("Account not found.");
        }

        System.out.println();

        // Transfer money
        System.out.println("===== TRANSFER MONEY =====");

        bank.transferMoney(
                "ACC0341",
                "ACC001JJ",
                200);

        System.out.println();

        // Show updated account details
        System.out.println("===== UPDATED ACCOUNTS =====");

        bank.listAccounts();

        // Print transaction history
        System.out.println("===== TRANSACTION HISTORY =====");

        BankAccount account =
                bank.findAccount("ACC0341");

        if (account != null) {
            account.printTransactionHistory();
        }
    }
}