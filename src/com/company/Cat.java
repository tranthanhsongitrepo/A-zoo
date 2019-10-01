package com.company;

public class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void sleep() {
        System.out.println("Cat's sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Cat's eating");
    }
}
