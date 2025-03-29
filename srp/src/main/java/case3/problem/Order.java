package case3.problem;

public class Order {
    private String orderId;
    private double amount;
    private String customerEmail;

    public Order(String orderId, double amount, String customerEmail) {
        this.orderId = orderId;
        this.amount = amount;
        this.customerEmail = customerEmail;
    }

    public double calculateTotal() {
        return amount * 1.1; 
    }

    public void processPayment() {
        System.out.println("Processing payment for order: " + orderId);
    }

    public void sendConfirmationEmail() {
        System.out.println("Sending confirmation email to: " + customerEmail);
    }
}
