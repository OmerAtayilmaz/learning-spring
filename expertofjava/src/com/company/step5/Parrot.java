package com.company.step5;

public class Parrot extends Bird{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName()+" can fly!");
    }
}
