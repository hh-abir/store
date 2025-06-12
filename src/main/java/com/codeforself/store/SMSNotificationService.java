package com.codeforself.store;

import org.springframework.stereotype.Service;

@Service("sms")
public class SMSNotificationService implements NotificationService{
    @Override
    public void send(String msg){
        System.out.println("SMS NOTIFICATION");
        System.out.println("Message:"+ msg);
    }
}
