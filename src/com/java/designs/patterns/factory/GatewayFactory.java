package com.java.designs.patterns.factory;

import com.java.designs.patterns.factory.gateway.PaymentGateway;

public class GatewayFactory {

    public static PaymentGateway getInstance(String payment) {
        if (payment.equalsIgnoreCase("BanContact")) {
            return new com.java.designs.patterns.factory.connector.BanContact();
        } else if (payment.equalsIgnoreCase("Google Pay")) {
            return new com.java.designs.patterns.factory.connector.GooglePay();
        } else if (payment.equalsIgnoreCase("PayPal")) {
            return new com.java.designs.patterns.factory.connector.Paypal();
        }
        return new com.java.designs.patterns.factory.connector.ApplePay();
    }
}
