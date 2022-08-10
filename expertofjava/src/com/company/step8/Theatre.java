package com.company.step8;

import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seatList=new ArrayList<>();
    private int seatsPerRow;
    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        this.seatsPerRow=seatsPerRow;
        int lastRow='A'+(numRows-1);//'A' ascıı code:64
        for(char row='A';row<=lastRow;row++){
            for(int seatNum=1;seatNum<=seatsPerRow;seatNum++){
                Seat seat=new Seat(row+String.format("%02d",seatNum));
                seatList.add(seat);
            }
        }
    }

    public String getTheatreName(){
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat=new Seat(seatNumber );
        int foundSeat=Collections.binarySearch(seatList,requestedSeat,null); //List of seat,searched seat *FASTEST WAY IN SORTED LIST*
        if(foundSeat>=0){
            return seatList.get(foundSeat).reserve();
        }else{
            System.out.println("There is no seat"+seatNumber);
            return false;
        }
       /* for(Seat seat:seatList){
            System.out.print(".");
            if(seat.getSeatNumber().equals(seatNumber)){
                requestedSeat=seat;
                break;
            }
        }
        if(requestedSeat==null){
            System.out.println("There is no seat "+seatNumber);
            return false;
        }
        return requestedSeat.reserve();
        */

    }


    //for testing

    public void getSeats(){
        int counter=-1;
        for(Seat seat:seatList){
            counter++;
            if(counter==seatsPerRow){
                System.out.print("\n");
                counter=0;
            }
            if(seat.reserved){
                System.out.print(" "+"XXX");
            }else{
                System.out.print(" "+seat.getSeatNumber());
            }

        }
        System.out.print("\n");
    }

    private class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved=false;


        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved=true;
                System.out.println("Seat "+ seatNumber+ " reserved.");
                return true;
            }
            return false;
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved=false;
                System.out.println("Reservation of seat "+seatNumber+" cancelled");
                return true;
            }
            return false;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
    }
}
