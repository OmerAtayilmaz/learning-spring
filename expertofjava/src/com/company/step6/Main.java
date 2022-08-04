package com.company.step6;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args){


        //tip güvenliği
        ArrayList<Integer> items2=new ArrayList();
        items2.add(1);
        items2.add(2);
        items2.add(3);
        items2.add(4);
       // items2.add("hello");
        items2.add(5);
        printDoubled(items2);

        FootballPlayer joe=new FootballPlayer("Joe");
        BaseballPlayer pat=new BaseballPlayer("Pat");
        SoccerPlayer beckham=new SoccerPlayer("Beckham");

        Team<FootballPlayer> adeliadeCrows=new Team<FootballPlayer>("Adelaide Crows");
        adeliadeCrows.addPlayer(joe);
       //ERROR: adeliadeCrows.addPlayer(pat);
       //ERROR: adeliadeCrows.addPlayer(beckham);

        Team<BaseballPlayer> baseballPlayerTeam=new Team<>("Chicago Cubs");
        baseballPlayerTeam.addPlayer(pat);

        System.out.println(adeliadeCrows.numPlayers());

        ///
        //Team<String> hataliKullanim=new Team<>("Chicago Cubs");
        baseballPlayerTeam.addPlayer(pat);
    }
    public static void printDoubled(ArrayList arrayList){
        for (Object i:arrayList){
            System.out.println((Integer)i*2);
        }
    }

}
