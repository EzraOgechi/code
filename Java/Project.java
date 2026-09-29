import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Header / parties
        System.out.println("Enter 'Bill To' information:");
        System.out.print("  Name: ");
        String billName = sc.nextLine();
        System.out.print("  Address (single line): ");
        String billAddress = sc.nextLine();
        System.out.print("  GSTIN: ");
        String billGstin = sc.nextLine();
        System.out.print("  Contact: ");
        String billContact = sc.nextLine();
        System.out.print("  Email: ");
        String billEmail = sc.nextLine();

        System.out.println("\nEnter 'Ship To' information:");
        System.out.print("  Name: ");
        String shipName = sc.nextLine();
        System.out.print("  Address (single line): ");
        String shipAddress = sc.nextLine();
        System.out.print("  GSTIN: ");
        String shipGstin = sc.nextLine();
        System.out.print("  Contact: ");
        String shipContact = sc.nextLine();
        System.out.print("  Email: ");
        String shipEmail = sc.nextLine();

        System.out.println("\nNow enter product information for 7 products (one by one).");
        // Product 1
        System.out.println("\nProduct 1:");
        System.out.print("  Product Code (integer): ");
        int p1_code = Integer.parseInt(sc.nextLine());
        System.out.print("  Product Name: ");
        String p1_name = sc.nextLine();
        System.out.print("  HSN code: ");
        String p1_hsn = sc.nextLine();
        System.out.print("  Quantity (number): ");
        double p1_qty = Double.parseDouble(sc.nextLine());
        System.out.print("  Units (e.g. nos, kg): ");
        String p1_units = sc.nextLine();
        System.out.print("  Rate (per unit): ");
        double p1_rate = Double.parseDouble(sc.nextLine());
        System.out.print("  Tax % (e.g. 5 or 18): ");
        double p1_tax = Double.parseDouble(sc.nextLine());
        double p1_amount = p1_qty * p1_rate * (1.0 + p1_tax / 100.0);

        // Product 2
        System.out.println("\nProduct 2:");
        System.out.print("  Product Code (integer): ");
        int p2_code = Integer.parseInt(sc.nextLine());
        System.out.print("  Product Name: ");
        String p2_name = sc.nextLine();
        System.out.print("  HSN code: ");
        String p2_hsn = sc.nextLine();
        System.out.print("  Quantity (number): ");
        double p2_qty = Double.parseDouble(sc.nextLine());
        System.out.print("  Units (e.g. nos, kg): ");
        String p2_units = sc.nextLine();
        System.out.print("  Rate (per unit): ");
        double p2_rate = Double.parseDouble(sc.nextLine());
        System.out.print("  Tax % (e.g. 5 or 18): ");
        double p2_tax = Double.parseDouble(sc.nextLine());
        double p2_amount = p2_qty * p2_rate * (1.0 + p2_tax / 100.0);

        // Product 3
        System.out.println("\nProduct 3:");
        System.out.print("  Product Code (integer): ");
        int p3_code = Integer.parseInt(sc.nextLine());
        System.out.print("  Product Name: ");
        String p3_name = sc.nextLine();
        System.out.print("  HSN code: ");
        String p3_hsn = sc.nextLine();
        System.out.print("  Quantity (number): ");
        double p3_qty = Double.parseDouble(sc.nextLine());
        System.out.print("  Units (e.g. nos, kg): ");
        String p3_units = sc.nextLine();
        System.out.print("  Rate (per unit): ");
        double p3_rate = Double.parseDouble(sc.nextLine());
        System.out.print("  Tax % (e.g. 5 or 18): ");
        double p3_tax = Double.parseDouble(sc.nextLine());
        double p3_amount = p3_qty * p3_rate * (1.0 + p3_tax / 100.0);

        // Product 4
        System.out.println("\nProduct 4:");
        System.out.print("  Product Code (integer): ");
        int p4_code = Integer.parseInt(sc.nextLine());
        System.out.print("  Product Name: ");
        String p4_name = sc.nextLine();
        System.out.print("  HSN code: ");
        String p4_hsn = sc.nextLine();
        System.out.print("  Quantity (number): ");
        double p4_qty = Double.parseDouble(sc.nextLine());
        System.out.print("  Units (e.g. nos, kg): ");
        String p4_units = sc.nextLine();
        System.out.print("  Rate (per unit): ");
        double p4_rate = Double.parseDouble(sc.nextLine());
        System.out.print("  Tax % (e.g. 5 or 18): ");
        double p4_tax = Double.parseDouble(sc.nextLine());
        double p4_amount = p4_qty * p4_rate * (1.0 + p4_tax / 100.0);

        // Product 5
        System.out.println("\nProduct 5:");
        System.out.print("  Product Code (integer): ");
        int p5_code = Integer.parseInt(sc.nextLine());
        System.out.print("  Product Name: ");
        String p5_name = sc.nextLine();
        System.out.print("  HSN code: ");
        String p5_hsn = sc.nextLine();
        System.out.print("  Quantity (number): ");
        double p5_qty = Double.parseDouble(sc.nextLine());
        System.out.print("  Units (e.g. nos, kg): ");
        String p5_units = sc.nextLine();
        System.out.print("  Rate (per unit): ");
        double p5_rate = Double.parseDouble(sc.nextLine());
        System.out.print("  Tax % (e.g. 5 or 18): ");
        double p5_tax = Double.parseDouble(sc.nextLine());
        double p5_amount = p5_qty * p5_rate * (1.0 + p5_tax / 100.0);

        // Product 6
        System.out.println("\nProduct 6:");
        System.out.print("  Product Code (integer): ");
        int p6_code = Integer.parseInt(sc.nextLine());
        System.out.print("  Product Name: ");
        String p6_name = sc.nextLine();
        System.out.print("  HSN code: ");
        String p6_hsn = sc.nextLine();
        System.out.print("  Quantity (number): ");
        double p6_qty = Double.parseDouble(sc.nextLine());
        System.out.print("  Units (e.g. nos, kg): ");
        String p6_units = sc.nextLine();
        System.out.print("  Rate (per unit): ");
        double p6_rate = Double.parseDouble(sc.nextLine());
        System.out.print("  Tax % (e.g. 5 or 18): ");
        double p6_tax = Double.parseDouble(sc.nextLine());
        double p6_amount = p6_qty * p6_rate * (1.0 + p6_tax / 100.0);

        // Product 7
        System.out.println("\nProduct 7:");
        System.out.print("  Product Code (integer): ");
        int p7_code = Integer.parseInt(sc.nextLine());
        System.out.print("  Product Name: ");
        String p7_name = sc.nextLine();
        System.out.print("  HSN code: ");
        String p7_hsn = sc.nextLine();
        System.out.print("  Quantity (number): ");
        double p7_qty = Double.parseDouble(sc.nextLine());
        System.out.print("  Units (e.g. nos, kg): ");
        String p7_units = sc.nextLine();
        System.out.print("  Rate (per unit): ");
        double p7_rate = Double.parseDouble(sc.nextLine());
        System.out.print("  Tax % (e.g. 5 or 18): ");
        double p7_tax = Double.parseDouble(sc.nextLine());
        double p7_amount = p7_qty * p7_rate * (1.0 + p7_tax / 100.0);

        // Totals & discount
        double total = p1_amount + p2_amount + p3_amount + p4_amount + p5_amount + p6_amount + p7_amount;
        double discountPercent = 0.6368 / 100.0; // 0.6368%
        double discountAmount = total * discountPercent;
        // Round to 2 decimals for presentation (we do not change calculations, just formatting)
        double grandTotal = total - discountAmount;

        // Print the formatted invoice (approximation of sample layout)
        System.out.println("\n\n==================== SALES INVOICE ====================\n");
        System.out.println("Bill To:");
        System.out.println("  " + billName);
        System.out.println("  " + billAddress);
        System.out.println("  GSTIN: " + billGstin);
        System.out.println("  Contact: " + billContact);
        System.out.println("  Email: " + billEmail);

        System.out.println("\nShip To:");
        System.out.println("  " + shipName);
        System.out.println("  " + shipAddress);
        System.out.println("  GSTIN: " + shipGstin);
        System.out.println("  Contact: " + shipContact);
        System.out.println("  Email: " + shipEmail);

        System.out.println("\nPayment Date: 7 days from date of delivery");
        System.out.println("Payment Terms: 100% against invoice\n");

        // Table header
        System.out.println(String.format("%-4s %-12s %-28s %-10s %8s %6s %10s %6s %12s",
                "S.No", "Prod Code", "Product Name", "HSN code", "Quantity", "Units", "Rate", "Tax", "Amount"));
        System.out.println("-----------------------------------------------------------------------------------------------");

        // Rows (formatted)
        System.out.println(String.format("%-4s %-12d %-28s %-10s %8.0f %6s %10.2f %5.0f%% %12.2f",
                "1", p1_code, p1_name, p1_hsn, p1_qty, p1_units, p1_rate, p1_tax, p1_amount));
        System.out.println(String.format("%-4s %-12d %-28s %-10s %8.0f %6s %10.2f %5.0f%% %12.2f",
                "2", p2_code, p2_name, p2_hsn, p2_qty, p2_units, p2_rate, p2_tax, p2_amount));
        System.out.println(String.format("%-4s %-12d %-28s %-10s %8.0f %6s %10.2f %5.0f%% %12.2f",
                "3", p3_code, p3_name, p3_hsn, p3_qty, p3_units, p3_rate, p3_tax, p3_amount));
        System.out.println(String.format("%-4s %-12d %-28s %-10s %8.0f %6s %10.2f %5.0f%% %12.2f",
                "4", p4_code, p4_name, p4_hsn, p4_qty, p4_units, p4_rate, p4_tax, p4_amount));
        System.out.println(String.format("%-4s %-12d %-28s %-10s %8.0f %6s %10.2f %5.0f%% %12.2f",
                "5", p5_code, p5_name, p5_hsn, p5_qty, p5_units, p5_rate, p5_tax, p5_amount));
        System.out.println(String.format("%-4s %-12d %-28s %-10s %8.0f %6s %10.2f %5.0f%% %12.2f",
                "6", p6_code, p6_name, p6_hsn, p6_qty, p6_units, p6_rate, p6_tax, p6_amount));
        System.out.println(String.format("%-4s %-12d %-28s %-10s %8.0f %6s %10.2f %5.0f%% %12.2f",
                "7", p7_code, p7_name, p7_hsn, p7_qty, p7_units, p7_rate, p7_tax, p7_amount));

        System.out.println("-----------------------------------------------------------------------------------------------");

        System.out.println(String.format("%64s %12.2f", "Total", total));
        System.out.println(String.format("%64s %12.2f", "Discounts (" + String.format("%.4f", 0.6368) + "%)", discountAmount));
        System.out.println(String.format("%64s %12.2f", "Grand total", grandTotal));

        sc.close();
    }
}

