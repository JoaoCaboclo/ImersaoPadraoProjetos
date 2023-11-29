package org.example.adapterpatternprocessopayment.adapters;

import org.example.adapterpatternprocessopayment.interfacepayment.PaymentGateway;
import org.example.adapterpatternprocessopayment.bussinessrules.StripePaymentRules;

public class StripeAdapter implements PaymentGateway {
    private StripePaymentRules stripePaymentRules;

    public StripeAdapter(StripePaymentRules stripePaymentRules) {
        this.stripePaymentRules = stripePaymentRules;
    }

    @Override
    public void processPayment(double amount) {
        // Convert our application's method to Stripe's method
        stripePaymentRules.charge(amount);
    }
}

