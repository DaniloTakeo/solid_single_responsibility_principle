package case3.solution;

public class Order {
    private String orderId;
    private double amount;

    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public double calculateTotal() {
        return amount * 1.1; 
    }

    public String getOrderId() {
        return orderId;
    }
}
