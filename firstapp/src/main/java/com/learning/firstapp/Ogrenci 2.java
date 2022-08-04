package com.learning.firstapp;

public class Ogrenci {
    public int number=0;
    public static int counter=0;
    public Ogrenci(){
        number++;
        counter++;
        System.out.println("Number:"+number+"Counter:"+counter);
    }

}
