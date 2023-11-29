package org.example.adapterpatternprocessopayment.bussinessrules;

public class PayPalPaymentRules {
    public void makePayment(double amount) {
        // PayPal-specific payment processing logic
        System.out.println("Paid $" + amount + " via PayPal.");
    }
}

