package salesreport;

import java.util.List;

/**
 * Business Layer: Processes data and calculates totals.
 */
public class SalesService {
    private SalesData salesData;

    public SalesService() {
        this.salesData = new SalesData();
    }

    /**
     * Generates a formatted sales report with total revenue.
     * @return Formatted report string.
     */
    public String generateSalesReport() {
        List<String> rawData = salesData.getAllSales();
        double totalRevenue = 0.0;
        StringBuilder report = new StringBuilder();

        report.append("--- SALES REPORT ---\n");
        for (String record : rawData) {
            report.append(record).append("\n");
            try {
                String[] parts = record.split(",");
                String priceStr = parts[2].replace("$", "").trim();
                totalRevenue += Double.parseDouble(priceStr);
            } catch (Exception e) {
                System.out.println("Error parsing record: " + record);
            }
        }
        report.append("--------------------\n");
        report.append("Total Revenue: $").append(totalRevenue);
        return report.toString();
    }
}
