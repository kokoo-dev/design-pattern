package com.example.design.creational.factory;

public class AnimalFactory {

    public Animal getAnimal(String type){
        if(type == null)
            return null;

        if(type.equalsIgnoreCase("dog")){
            return new Dog();
        } else if(type.equalsIgnoreCase("cat")){
            return new Cat();
        } else if(type.equalsIgnoreCase("tiger")){
            return new Tiger();
        }

        return null;
    }
}
