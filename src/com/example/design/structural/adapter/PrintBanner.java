package com.example.design.structural.adapter;

public class PrintBanner extends Banner implements Print{
    public PrintBanner(String text){
        super(text);
    }

    @Override
    public void printWeak() {
        printBanner();
    }

    @Override
    public void printStrong() {
        printBanner();
    }
}
