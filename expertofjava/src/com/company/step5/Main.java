package com.company.step5;

 public class Main {
    public static void main(String[] args){
        //Abstract class biçimi ile DOG CONSTRUCTOR KULLANIP OBJE OLUŞTURDUK
        Animal an=new Dog("German Sphredet");
        an.breath();
        an.eat();

        //ERROR: Bird parrot=new Bird(); you cannot initialize object from abstract class
        Parrot parrot=new Parrot("EHEHE");
        parrot.fly();
    }
}
