package case2.problem;

public class Invoice {
    private double amount;
    private String email;

    public Invoice(double amount, String email) {
        this.amount = amount;
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public String getEmail() {
        return email;
    }

    public double calculateTotal() {
        return amount * 1.1;  
    }

    public void sendInvoice() {
        System.out.println("Sending invoice to: " + email);
    }
}
