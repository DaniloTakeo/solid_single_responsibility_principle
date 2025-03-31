package case4.solution;

import java.util.List;

public class ReportPrinter {
    public void printReport(SalesReport report) {
        List<String> data = report.getSalesData();
        System.out.println("Printing sales report...");
        for (String line : data) {
            System.out.println(line);
        }
    }
}