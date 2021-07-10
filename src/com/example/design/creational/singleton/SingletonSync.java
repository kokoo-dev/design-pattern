package com.example.design.creational.singleton;

public class SingletonSync {

    private SingletonSync(){}

    private static class LazyHolder {
        private static final SingletonSync instance = new SingletonSync();
    }

    public static SingletonSync getInstance(){
        return LazyHolder.instance;
    }
}
