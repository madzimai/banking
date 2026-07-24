public class Main {

    public static void main(String[] args) {

        // Create the bank
        Bank bank = new Bank();

        // Create different account types
        SavingsAccount netsai =
                new SavingsAccount(
                        "Netsai",
                        1000,
                        "SAV001",
                        0.05);

        CurrentAccount tariro =
                new CurrentAccount(
                        "Tariro",
                        500,
                        "CUR001",
                        300);

        SavingsAccount john =
                new SavingsAccount(
                        "John",
                        800,
                        "SAV002",
                        0.03);

        // Add accounts to the bank
        bank.addAccount(netsai);
        bank.addAccount(tariro);
        bank.addAccount(john);

        // Display total accounts
        System.out.println("==================================");
        System.out.println("WELCOME TO JAVA BANKING SYSTEM");
        System.out.println("==================================");

        System.out.println();
        System.out.println("Total Accounts: "
                + bank.getTotalAccounts());

        // Display all accounts
        System.out.println();
        System.out.println("===== ALL ACCOUNTS =====");

        bank.listAccounts();

        // Search account
        System.out.println();
        System.out.println("===== SEARCH ACCOUNT =====");

        BankAccount account =
                bank.findAccount("CUR001");

        if (account != null) {
            account.printDetails();
        }

        // Deposit
        System.out.println();
        System.out.println("===== DEPOSIT =====");

        netsai.deposit(500);

        // Withdraw
        System.out.println();
        System.out.println("===== WITHDRAW =====");

        tariro.withdraw(700);

        // Add interest
        System.out.println();
        System.out.println("===== ADD INTEREST =====");

        netsai.addInterest();

        // Transfer money
        System.out.println();
        System.out.println("===== TRANSFER MONEY =====");

        bank.transferMoney(
                "SAV001",
                "CUR001",
                200);

        // Display updated accounts
        System.out.println();
        System.out.println("===== UPDATED ACCOUNTS =====");

        bank.listAccounts();

        // Transaction history
        System.out.println();
        System.out.println("===== TRANSACTION HISTORY =====");

        netsai.printTransactionHistory();

        System.out.println();

        tariro.printTransactionHistory();

        System.out.println();

        john.printTransactionHistory();

        System.out.println();
        System.out.println("===== END OF DEMO =====");
        //Apply Interest
        System.out.println();
        System.out.println("===== APPLY INTEREST =====");

        bank.applyInterest();
        bank.listAccounts();
    }
}