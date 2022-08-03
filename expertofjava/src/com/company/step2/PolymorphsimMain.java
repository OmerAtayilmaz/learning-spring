package com.company.step2;

import java.util.Arrays;

class Movie{
    private String name;
    public Movie(String name){
        this.name=name;
    }
    public String plot(){
        return "No plot here.";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("JAWS");
    }
    @Override
    public String plot(){
        return "A shark eats lots of people.";
    }
}
class  IndepenceDay extends Movie{
    public IndepenceDay(){
        super("Independe Day");
    }
    @Override
    public String plot(){
        return "Aliens attemt to take over plant earth!";
    }
}
class MazeRunner extends Movie{
    public MazeRunner (){
        super("Maze Runner");
    }
    @Override
    public String plot(){
        return "Kids try and escape a maze.";
    }
}
class Forgetable extends  Movie{
    public Forgetable(){
        super("Forgetable");
    }
}
public class PolymorphsimMain  {
    public static void main(String[] logs){
        for (int i=0;i<11;i++){
            Movie movie=randomMovie();
            System.out.println("Movie #"+i+":"+movie.getName()+"\n"+
            "Plot:"+movie.plot()+"\n"
            );
        }
    }

    public static Movie randomMovie(){
        int randomNumber=(int)(Math.random()*4)+1;
        System.out.println("Random number generated was:"+randomNumber);
        switch (randomNumber){
            case 0: case 1:
                return new Jaws();
            case 2:
                return new IndepenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Forgetable();
        }
        return null;
    }
}
