package com.learning.firstapp;

public class BenimClass {
    int number;

    public void setNumber(int a)  {
        if(a==1) throw new NumberFormatException("Something went wrong!");
        this.number=a;
    }

    public void anotherFunction(int x){
        if(x==2)throw new NullPointerException("Null Pointer hatası var");
    }
}
