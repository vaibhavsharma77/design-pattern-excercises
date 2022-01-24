package com.java.designs.patterns.factory.connector;

import com.java.designs.patterns.factory.gateway.PaymentGateway;

public class GooglePay implements PaymentGateway {
    @Override
    public void redirect() {
        System.out.println("redirecting to google payment");
    }
}
