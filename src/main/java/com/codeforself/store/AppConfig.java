package com.codeforself.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Value("${payment-gateway:stripe}")
    public String paymentGateway;
    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal(){
        return new PayPalPaymentService();
    }

    @Bean
    @Scope("prototype")
    public OrderService orderService(){
        if (paymentGateway == "stripe"){
            return new OrderService(stripe());
        }
        return new OrderService(paypal());
    }
}
