package com.codeforself.store;

// import org.springframework.stereotype.Service;

// @Service
public class OrderService {
    private PaymentService paymentService;
    
    
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService Created");
    }

    public void placeOrder(){
        paymentService.processPayment(100.0);
    }
    
}
