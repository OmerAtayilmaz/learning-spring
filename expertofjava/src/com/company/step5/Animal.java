package com.company.step5;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void eat();
    public abstract void breath();

    public String getName() {
        return name;
    }
}

//abstract class extends edilir, implement edilemez!
//abstract class extend edildiken sonra constructor varsa super() ile cagırılmak zorundadır.

