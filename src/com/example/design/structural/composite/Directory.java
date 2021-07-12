package com.example.design.structural.composite;

import java.util.ArrayList;

public class Directory implements Entry{
    private String name;
    private ArrayList<Entry> directory = new ArrayList();

    public Directory(String name){
        this.name = name;
    }

    public void add(Entry entry){
        directory.add(entry);
    }

    public void remove(Entry entry){
        directory.remove(entry);
    }

    public ArrayList<Entry> getDirectory() {
        return directory;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this.getName());
        for(Entry entry : directory){
            entry.printList(prefix + "/" + name);
        }
    }
}
