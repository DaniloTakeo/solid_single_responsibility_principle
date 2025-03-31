package case4.problem;

import java.util.List;

public class SalesReport {
    private List<String> salesData;

    public SalesReport(List<String> salesData) {
        this.salesData = salesData;
    }

    public void generateReport() {
        System.out.println("Generating sales report...");
    }

    public void exportToCSV() {
        System.out.println("Exporting sales report to CSV...");
    }

    public void printReport() {
        System.out.println("Printing sales report...");
    }
}
