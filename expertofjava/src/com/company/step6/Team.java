package com.company.step6;

import java.util.ArrayList;

public class Team<T extends Player & Query & CRUD> {
    private String name;
    int played=0;
    int won=0;
    int lost=0;
    int tied=0;

    private ArrayList<T> members=new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)) {
            System.out.println((player).getName()+" is already on this team");
            return false;
        }else{
            members.add(player);
            System.out.println((player).getName()+" picked for team "+this.name);
            return true;
        }
    }

    public int numPlayers(){
    return this.members.size();
    }
    public void matchResult(Team opponent, int ourScore, int theirScore){
        if(ourScore>theirScore){
            won++;
        }else if(ourScore==theirScore){
            tied++;
        }else{
            lost++;
        }
        played++;
        if(opponent!=null){
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int ranking(){
        return (won*2)+tied;
    }
}
