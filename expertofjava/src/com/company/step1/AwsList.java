package com.company.step1;

import java.util.LinkedList;

public class AwsList {

    public static int sumOfNumberInLinkedList(LinkedList<Number> linkedList){
        int sum=0;
        for (Object item : linkedList) sum +=(int) item;
        return sum;
    }


}
