package case3.solution;

public class EmailService {
    public void sendConfirmationEmail(String customerEmail, String orderId) {
        System.out.println("Sending confirmation email to: " + customerEmail + " for order: " + orderId);
    }
}
