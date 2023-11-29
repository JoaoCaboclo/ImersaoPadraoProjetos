package org.example.adapterpatternprocessopayment;

import org.example.adapterpatternprocessopayment.adapters.PayPalAdapter;
import org.example.adapterpatternprocessopayment.adapters.StripeAdapter;
import org.example.adapterpatternprocessopayment.bussinessrules.PayPalPaymentRules;
import org.example.adapterpatternprocessopayment.bussinessrules.StripePaymentRules;
import org.example.adapterpatternprocessopayment.interfacepayment.PaymentGateway;

public class PaymentApp {

    public static void main(String[] args) {

        PaymentGateway payPalAdapter = new PayPalAdapter(new PayPalPaymentRules());
        PaymentGateway StripeAdapter = new StripeAdapter(new StripePaymentRules());

        double amount = 100.0;

        // Process payments using different payment gateways
        payPalAdapter.processPayment(amount);
        StripeAdapter.processPayment(amount);
    }

}
