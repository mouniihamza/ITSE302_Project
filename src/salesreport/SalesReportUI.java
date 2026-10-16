package salesreport;

import java.util.Scanner;

/**
 * Presentation Layer: Handles user interaction.
 */
public class SalesReportUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SalesService salesService = new SalesService();

        System.out.println("Welcome to the Sales System.");
        System.out.println("Press Enter to view the Sales Report...");

        scanner.nextLine(); // Wait for user input

        String report = salesService.generateSalesReport();
        System.out.println(report);

        scanner.close();
    }
}

