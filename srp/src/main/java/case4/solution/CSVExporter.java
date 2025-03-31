package case4.solution;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVExporter {
    public void exportToCSV(SalesReport report, String filePath) {
        List<String> data = report.getSalesData();
        
        try (FileWriter writer = new FileWriter(filePath)) {
            for (String line : data) {
                writer.write(line + "\n");
            }
            System.out.println("Sales report exported to CSV: " + filePath);
        } catch (IOException e) {
            System.err.println("Error exporting CSV: " + e.getMessage());
        }
    }
}