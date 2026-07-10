import java.time.LocalDateTime;

public class Transaction {

    private LocalDateTime dateTime;
    private String type;
    private double amount;
    private String description;

    public Transaction(String type,
                       double amount,
                       String description) {

        this.dateTime = LocalDateTime.now();
        this.type = type;
        this.amount = amount;
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getType() {
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
}
