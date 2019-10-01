package com.company;

public class Hippo extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Grunt");
    }

    @Override
    public void sleep() {
        System.out.println("Hippo's sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Hippo's eating");
    }
}
