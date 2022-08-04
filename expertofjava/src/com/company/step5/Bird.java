package com.company.step5;

public abstract class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"is Pecking");
    }

    @Override
    public void breath() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    public abstract void fly();
}
