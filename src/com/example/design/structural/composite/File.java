package com.example.design.structural.composite;

import java.util.ArrayList;

public class File implements Entry{
    private String name;

    public File(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this.getName());
    }
}
