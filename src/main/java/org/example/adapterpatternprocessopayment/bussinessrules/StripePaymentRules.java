package org.example.adapterpatternprocessopayment.bussinessrules;

public class StripePaymentRules {
    public void charge(double amount) {
        // Stripe-specific payment processing logic
        System.out.println("Charged $" + amount + " using Stripe.");
    }
}
