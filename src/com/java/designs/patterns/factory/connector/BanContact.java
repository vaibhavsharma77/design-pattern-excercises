package com.java.designs.patterns.factory.connector;

import com.java.designs.patterns.factory.gateway.PaymentGateway;

public class BanContact implements PaymentGateway {
    @Override
    public void redirect() {
        System.out.println("Redirecting to bancontact gateway");
    }
}
