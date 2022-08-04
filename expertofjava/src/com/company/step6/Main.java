package com.company.step6;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args){
        ArrayList items=new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add("hello");
        items.add(5);

        printDoubled(items);
    }
    public static void printDoubled(ArrayList arrayList){
        for (Object i:arrayList){
            System.out.println((Integer)i*2);
        }
    }

}
