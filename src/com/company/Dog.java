package com.company;

public class Dog extends Animal implements Canine{
    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }

    @Override
    public void sleep() {
        System.out.println("Dog's sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Dog's eating");
    }

    @Override
    public void roam() {
        System.out.println("Dog's roaming");
    }
}
