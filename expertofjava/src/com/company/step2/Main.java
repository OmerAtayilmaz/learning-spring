package com.company.step2;
import java.util.Scanner;
public class Main {
    public class AwesomeInfo{
        private int id;
        private String name;
        private byte age;
        public AwesomeInfo(int id,String name,byte age) {
            this(id,name); //super keyword gibi diğer constructorları kullanabilirim
            this.age=age;
        }

        public AwesomeInfo(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
    public static void main(String[] args) {
        /* Overloading - methodu unique kılan method imzası parametresidir.
        * Eğer methodun türünü değiştirsen bile, parametreler ve method ismi aynı ise hata verir!
        * */

        calculateScore("Steve",10);
        calculateScore();
        Scanner scanner=new Scanner(System.in);
        int score=scanner.nextInt();
        calculateScore(score);
    }
    public static int calculateScore(String playerName,int score){
        System.out.println("Player "
        +playerName +" scored "
        +score+" points");
        return score*1000;
    }
    public static int calculateScore(int score){
        System.out.println("Player scored "
        +score+" points");
        return score*1000;
    }
    public static int calculateScore(){
        System.out.println("No Player, no score");
        return -1;
    }
}
