package com.company.step9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReader locFile=null;
        try{
        locFile=new FileReader("locations.txt");

        }catch(IOException e){
            System.out.println("STH WENT WRONG");
            e.printStackTrace();
        }
    }
}
