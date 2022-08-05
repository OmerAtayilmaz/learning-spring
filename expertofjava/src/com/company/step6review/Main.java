package com.company.step6review;
public class Main{
    public static void main(String[] args){
        /*
        * Employee base class
        * Manager extends Employee
        * Developer extends Employee
        * Teamleader extends Employee
        * Front-end extends Developer
        * Back-end extends Developer
         */
         Company<Developer> enoca=new Company<>();

         BackEnd backEnd=new BackEnd("Jonas Schmedtman",50000,"NODEJS & EXPRESSJS",Boolean.TRUE);
         FrontEnd frontEnd=new FrontEnd("George Orwell",30000,"SASS & SCSS & TailwindCSS",Boolean.TRUE);
         Manager manager=new Manager("Mesut Bey",75000);

         enoca.addEmployee(backEnd);
         enoca.addEmployee(frontEnd);
         //enoca.addEmployee(manager);
    }
}