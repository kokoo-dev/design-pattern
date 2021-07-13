package com.example.design.creational.builder;

public class Run {

    public void run(){
        Person person = new Person.Builder()
                .name("홍길동")
                .nickname("길동이")
                .age(20)
                .height(180)
                .weight(80)
                .footSize(280)
                .build();

        System.out.println(person.toString());
    }
}
