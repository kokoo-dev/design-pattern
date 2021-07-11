package com.example.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Youtuber implements Publisher{
    private List<Observer> observers = new ArrayList<>();

    public void beginBroadcast(){
        notifyObserver("방송을 시작했습니다.");
    }

    public void uploadVideo(){
        notifyObserver("영상을 업로드하였습니다.");
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for(Observer observer : observers){
            observer.notifyMessage(message);
        }
    }
}
