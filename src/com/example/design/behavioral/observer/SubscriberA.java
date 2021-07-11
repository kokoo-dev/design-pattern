package com.example.design.behavioral.observer;

public class SubscriberA implements Observer{
    private Publisher publisher;

    public SubscriberA(Publisher publisher){
        this.publisher = publisher;
        publisher.addObserver(this);
    }

    @Override
    public void notifyMessage(String message) {
        System.out.println("A 구독자 수신 : " + message);
    }
}
