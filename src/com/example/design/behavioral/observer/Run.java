package com.example.design.behavioral.observer;

public class Run {
    public void run(){
        Youtuber youtuber = new Youtuber();
        Observer subscriberA = new SubscriberA(youtuber);
        Observer subscriberB = new SubscriberB(youtuber);

        youtuber.beginBroadcast();
        youtuber.uploadVideo();

        youtuber.deleteObserver(subscriberA);

        youtuber.beginBroadcast();
        youtuber.uploadVideo();
    }
}
