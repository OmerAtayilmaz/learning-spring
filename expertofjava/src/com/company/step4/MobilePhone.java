package com.company.step4;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn=false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    public int getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    @Override
    public void powerOn() {
        System.out.println("Mobile pohne powered up");
    }

    @Override
    public void dial(int phoneNumber) {
    if(isOn)
        System.out.println("Now ringing"+phoneNumber+" on mobile phone");
    else
        System.out.println("Phone is switched off");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering mobilephone");
            isRinging=false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber&&isOn)
        {
            isRinging=true;
            System.out.println("Melody ring");
        }else{
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}