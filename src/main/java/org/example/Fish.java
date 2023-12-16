package org.example;

public class Fish extends Animal{
    @Override
    public void toGo() {
        throw new IllegalArgumentException("Животное не умеет ходить");
    }

    @Override
    public void fly() {
        throw new IllegalArgumentException("Животное не умеет летать");
    }

    @Override
    public void swim() {
        super.swim();
    }
}
