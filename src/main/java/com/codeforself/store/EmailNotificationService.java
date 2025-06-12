package com.codeforself.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String msg){
        System.out.println("EMAIL NOTIFICATION");
        System.out.println("Message: "+ msg);
    }
}
