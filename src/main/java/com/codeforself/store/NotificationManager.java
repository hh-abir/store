package com.codeforself.store;

import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    private final NotificationService notificationService;
    public NotificationManager(NotificationService service){
        this.notificationService = service;
    }

    public void send(String message){
        notificationService.send(message);
    }
}
