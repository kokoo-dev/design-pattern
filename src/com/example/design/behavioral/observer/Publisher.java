package com.example.design.behavioral.observer;

public interface Publisher {
    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObserver(String message);
}
