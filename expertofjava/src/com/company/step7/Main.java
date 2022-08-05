package com.company.step7;


import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {
        //org.w3c.dom.Node node=null;
        //Node Node=null;

        //final degeri degistirebilme
        SomeClass one=new SomeClass("one");
        SomeClass two=new SomeClass("two");
        SomeClass three=new SomeClass("three");
        SomeClass four=new SomeClass("four");

        //SECURITY, final oldugu icin izin vermez!: one.instanceNumber=25;

    }
}
