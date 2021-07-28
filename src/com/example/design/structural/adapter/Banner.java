package com.example.design.structural.adapter;

public class Banner {
    private String text;

    public Banner(String text){
        this.text = text;
    }

    public void printBanner(){
        System.out.println(text);
    }
}
