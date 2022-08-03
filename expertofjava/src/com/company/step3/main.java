package com.company.step3;

import java.util.ArrayList;

class Integers{
    private int integer;

    public Integers(int integer) {
        this.integer = integer;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }
}
public class main {
    public static void main(String[] args) {
        /*Autoboxing - Unboxing*/
        //ERROR: ArrayList<int> cannotUseThat=new ArrayList<int>();

        ArrayList<Integers> integers=new ArrayList<Integers>();
            integers.add(0,new Integers(25));

            ArrayList<Integer> integerArrayList=new ArrayList<>();
            for(int i=0;i<10;i++)
                integerArrayList.add(Integer.valueOf(i)); //Autoboxing primitive type to reference into wrapper class

            for (int i=0;i<=10;i++)
                 integerArrayList.get(i).intValue(); //Unboxing reference type to primitive type


        Integer myIntValue=55; //JAVA:Integer.valueOf(56);
        int myInt=myIntValue; //myIntValue.intValue();
    }
}
