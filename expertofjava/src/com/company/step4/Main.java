package com.company.step4;

public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone =new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();


        timsPhone=new MobilePhone(12312);
        timsPhone.powerOn();
        timsPhone.callPhone(12312);
        timsPhone.answer();
        timsPhone.dial(12312);

    }
}
