package com.disney.listener.movielistener;

import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;

@Component
public class MovieNotificationReceiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Movie Notification Received: <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}