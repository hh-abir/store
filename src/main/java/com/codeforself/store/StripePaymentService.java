package com.codeforself.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("stripe")
@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiURL}")
    public String apiURL;

    @Value("${stripe.enabled}")
    public boolean enabled;

    @Value("${stripe.timeout: 3000}")
    public int timeout;

    @Value("${stripe.supported-currencies}")
    public List<String> supportedCurrencies;

    @Override
    public void processPayment(double amount){
        System.out.println("Stripe");
        System.out.println("API URL: "+apiURL);
        System.out.println("Enabled: "+enabled);
        System.out.println("Timeout: "+timeout);
        System.out.println("Supported Currencies: "+supportedCurrencies);
        System.out.println("Amount: "+amount);
    }
}
