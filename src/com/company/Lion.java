package com.company;

public class Lion extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Lion's roar");
    }

    @Override
    public void sleep() {
        System.out.println("Lion's sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Lion's eating");
    }
}
