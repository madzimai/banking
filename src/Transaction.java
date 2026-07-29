import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction implements Printable {

    private final LocalDateTime date;
    private LocalDateTime dateTime;

    private TransactionType type;
    private double amount;
    private String description;

    public Transaction(
            TransactionType type,
            double amount,
            String description) {

        this.type = type;
        this.amount = amount;
        this.description = description;
        this.date = LocalDateTime.now();
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public TransactionType getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "[" + dateTime + "] "
                + type
                + " | Amount: $" + amount
                + " | " + description;
    }

    @Override
    public void printStatement() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");

        System.out.println("========================================");
        System.out.println("           TRANSACTION RECEIPT");
        System.out.println("========================================");
        System.out.println("Transaction Type : " + type);
        System.out.printf("Amount           : £%.2f%n", amount);
        System.out.println("Description      : " + description);
        System.out.println("Date             : " + date.format(formatter));
        System.out.println("========================================");
    }
}
