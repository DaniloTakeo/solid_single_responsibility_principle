package case2.solution;

public class InvoiceRepository {
    public void save(Invoice invoice) {
        System.out.println("Saving invoice with total: " + invoice.calculateTotal());
    }
}