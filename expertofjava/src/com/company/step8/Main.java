package com.company.step8;

public class Main {
    public static void main(String[] args) {
        Theatre theatre=new Theatre("Olympian",6,8);

        if(theatre.reserveSeat("E06")){
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry seems already taken");
        }

        if(theatre.reserveSeat("E01")){
            System.out.println("PLEASE PAY");
        }else{
            System.out.println("Sorry  seems already taken");
        }
        theatre.getSeats();
    }
}
