package case2.solution;

public class InvoiceEmailSender {
    public void sendInvoice(Invoice invoice, String email) {
        System.out.println("Sending invoice with total: " + invoice.calculateTotal() + " to " + email);
    }
}