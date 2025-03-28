package case2.solution;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1000);
        InvoiceRepository repository = new InvoiceRepository();
        InvoiceEmailSender emailSender = new InvoiceEmailSender();

        double total = invoice.calculateTotal();
        System.out.println("Total amount: " + total);

        repository.save(invoice);
        emailSender.sendInvoice(invoice, "customer@example.com");
    }
}