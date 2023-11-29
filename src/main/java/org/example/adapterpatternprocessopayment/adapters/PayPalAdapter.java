package org.example.adapterpatternprocessopayment.adapters;

import org.example.adapterpatternprocessopayment.interfacepayment.PaymentGateway;
import org.example.adapterpatternprocessopayment.bussinessrules.PayPalPaymentRules;

public class PayPalAdapter implements PaymentGateway {

    private PayPalPaymentRules payPalPaymentRules;

    public PayPalAdapter(PayPalPaymentRules paymentGateway) {
        this.payPalPaymentRules = paymentGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Convert our application's method to PayPal's method
        payPalPaymentRules.makePayment(amount);
    }
}


