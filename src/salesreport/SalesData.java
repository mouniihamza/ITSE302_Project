package salesreport;

import java.util.ArrayList;
import java.util.List;

/**
 * Data Layer: Simulates a database for sales records.
 */
public class SalesData {
    // Simulated database
    private List<String> salesRecords;

    public SalesData() {
        salesRecords = new ArrayList<>();
        salesRecords.add("2026-10-01, Product A, $100");
        salesRecords.add("2026-10-02, Product B, $50");
        salesRecords.add("2026-10-03, Product A, $75");
        salesRecords.add("2026-10-04, Product C, $25");
    }

    /**
     * Retrieves all sales records from the "database".
     * @return List of sales strings.
     */
    public List<String> getAllSales() {
        return salesRecords;
    }
}
