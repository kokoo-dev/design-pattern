package com.example.design.structural.adapter;

public class Run {
    public void run(){
        Print print = new PrintBanner("Adapter!!");
        print.printWeak();
        print.printStrong();
    }
}
