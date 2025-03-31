package case4.solution;

import java.util.List;

public class SalesReport {
    private List<String> salesData;

    public SalesReport(List<String> salesData) {
        this.salesData = salesData;
    }

    public void generateReport() {
        System.out.println("Generating sales report...");
    }

    public List<String> getSalesData() {
        return salesData;
    }
}