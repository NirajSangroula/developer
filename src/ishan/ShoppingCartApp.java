package ishan;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCartApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        List<Product> cart = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int numberOfProducts = scanner.nextInt();

        for (int i = 1; i <= numberOfProducts; i++) {
            System.out.println("\nEnter details for product " + i + ":");

            System.out.print("Product ID: ");
            int id = scanner.nextInt();

            scanner.nextLine(); // consume newline
            System.out.print("Product Name: ");
            String name = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            cart.add(new Product(id, name, price, quantity));
        }

        BillingService billingService = new BillingService();

        double subtotal = billingService.calculateSubtotal(cart);
        double discount = billingService.calculateDiscount(subtotal);
        double taxableAmount = subtotal - discount;
        double tax = billingService.calculateTax(taxableAmount);
        double finalAmount = taxableAmount + tax;

        System.out.println("\n=========== ITEMIZED BILL ===========");
        for (Product p : cart) {
            System.out.println(
                    p.getProductName() +
                            " | Price: $" + df.format(p.getPrice()) +
                            " | Qty: " + p.getQuantity() +
                            " | Total: $" + df.format(p.lineTotal())
            );
        }

        System.out.println("-----------------------------------");
        System.out.println("Subtotal: $" + df.format(subtotal));
        System.out.println("Discount: $" + df.format(discount));
        System.out.println("Tax (13%): $" + df.format(tax));
        System.out.println("Final Amount: $" + df.format(finalAmount));

        scanner.close();
    }
}
