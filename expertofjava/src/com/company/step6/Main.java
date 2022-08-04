package com.company.step6;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args){
        //güvenlik yok
        ArrayList items=new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add("hello");
        items.add(5);

        //tip güvenliği
        ArrayList<Integer> items2=new ArrayList();
        items2.add(1);
        items2.add(2);
        items2.add(3);
        items2.add(4);
       // items2.add("hello");
        items2.add(5);
        printDoubled(items2);
    }
    public static void printDoubled(ArrayList arrayList){
        for (Object i:arrayList){
            System.out.println((Integer)i*2);
        }
    }

}
