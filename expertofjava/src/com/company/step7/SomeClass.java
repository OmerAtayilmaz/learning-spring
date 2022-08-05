package com.company.step7;

public class SomeClass {

    private static int classCounter=0;
    //way0
    public final int instanceNumber;
    //way1
    private final String name;
    public SomeClass(String name) {
        this.name=name;
        classCounter++;
        instanceNumber=classCounter;
        System.out.println(name+" created, instance is "+instanceNumber );
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
