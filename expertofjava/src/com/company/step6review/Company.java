package com.company.step6review;

import com.sun.jdi.request.DuplicateRequestException;

import java.util.ArrayList;

public class Company<Type extends Employee & ICoding> {

    private ArrayList<Type> employees;

    public boolean addEmployee(Type employee){
        if (employees.contains(employee)) throw new DuplicateRequestException("This employee is already hired!");
        employees.add(employee);
        System.out.println("Neww employee hired!");
        return true;
    }
}
