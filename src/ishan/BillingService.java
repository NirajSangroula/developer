package ishan;

import java.util.List;

public class BillingService {

    private static final double TAX_RATE = 0.13;

    // Calculate subtotal using loop
    public double calculateSubtotal(List<Product> cart) {
        double subtotal = 0;
        for (Product p : cart) {
            subtotal += p.lineTotal();
        }
        return subtotal;
    }

    // Apply discount rules using conditionals
    public double calculateDiscount(double subtotal) {
        if (subtotal >= 1000) {
            return subtotal * 0.20;
        } else if (subtotal >= 500) {
            return subtotal * 0.10;
        }
        return 0;
    }

    // Apply tax (13%)
    public double calculateTax(double amountAfterDiscount) {
        return amountAfterDiscount * TAX_RATE;
    }
}
