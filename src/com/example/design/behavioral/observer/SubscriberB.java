package com.example.design.behavioral.observer;

public class SubscriberB implements Observer{
    private Publisher publisher;

    public SubscriberB(Publisher publisher){
        this.publisher = publisher;
        publisher.addObserver(this);
    }

    @Override
    public void notifyMessage(String message) {
        System.out.println("B 구독자 수신 : " + message);
    }
}
