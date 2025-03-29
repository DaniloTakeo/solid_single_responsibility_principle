package case3.solution;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("12345", 100.0);
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        EmailService emailService = new EmailService();

        paymentProcessor.processPayment(order);
        emailService.sendConfirmationEmail("cliente@email.com", order.getOrderId());

        System.out.println("Total order amount: " + order.calculateTotal());
    }
}
