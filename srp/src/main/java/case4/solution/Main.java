package case4.solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SalesReport report = new SalesReport(Arrays.asList("Sale 1: $100", "Sale 2: $200"));

        CSVExporter csvExporter = new CSVExporter();
        csvExporter.exportToCSV(report, "sales_report.csv");

        ReportPrinter printer = new ReportPrinter();
        printer.printReport(report);
    }
}