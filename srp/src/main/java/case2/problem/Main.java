package case2.problem;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1000, "customer@example.com");
        double total = invoice.calculateTotal();
        System.out.println("Total amount: " + total);
        invoice.sendInvoice();
    }
}