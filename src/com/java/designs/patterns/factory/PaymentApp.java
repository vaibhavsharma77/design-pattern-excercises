package com.java.designs.patterns.factory;

import com.java.designs.patterns.factory.GatewayFactory;
import com.java.designs.patterns.factory.gateway.PaymentGateway;

public class PaymentApp {

    public static void main(String[] args) {
        //Factory of Object
        PaymentGateway paymentGateway= GatewayFactory.getInstance("google pay");
        paymentGateway.redirect();
        PaymentGateway apple=GatewayFactory.getInstance("apple pay");
        apple.redirect();
    }
}
