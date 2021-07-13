package com.example.design.creational.builder;

public class Person {
    private String name;
    private String nickname;
    private int age;
    private int height;
    private int weight;
    private int footSize;

    public static class Builder{
        private String name;
        private String nickname;
        private int age;
        private int height;
        private int weight;
        private int footSize;

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder nickname(String value){
            this.nickname = value;
            return this;
        }

        public Builder age(int value){
            this.age = value;
            return this;
        }

        public Builder height(int value){
            this.height = value;
            return this;
        }

        public Builder weight(int value){
            this.weight = value;
            return this;
        }

        public Builder footSize(int value){
            this.footSize = value;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    private Person(Builder builder){
        name = builder.name;
        nickname = builder.nickname;
        age = builder.age;
        height = builder.height;
        weight = builder.weight;
        footSize = builder.footSize;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", footSize=" + footSize +
                '}';
    }
}
