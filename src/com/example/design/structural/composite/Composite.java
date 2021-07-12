package com.example.design.structural.composite;

public class Composite {

    public void run(){
        Directory rootDir = new Directory("root");
        Directory dir1 = new Directory("dir1");
        Directory dir2 = new Directory("dir2");

        rootDir.getDirectory().add(dir1);
        rootDir.getDirectory().add(dir2);

        dir1.getDirectory().add(new File("file1"));
        dir1.getDirectory().add(new File("file2"));

        rootDir.printList("");
    }

}
