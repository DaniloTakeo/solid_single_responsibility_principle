package case2.solution;

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    // Método de cálculo de fatura
    public double calculateTotal() {
        return amount * 1.1;  // Inclui uma taxa de 10%
    }
}