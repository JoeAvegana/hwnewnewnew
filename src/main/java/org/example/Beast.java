package org.example;

public class Beast extends Animal {
    @Override
    public void toGo() {
        super.toGo();
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
