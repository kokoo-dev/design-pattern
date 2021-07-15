package com.example.design.creational.factory;

public class Run {
    public void run(){
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal1 = animalFactory.getAnimal("dog");
        Animal animal2 = animalFactory.getAnimal("cat");
        Animal animal3 = animalFactory.getAnimal("tiger");

        animal1.bark();
        animal2.bark();
        animal3.bark();
    }
}
