package com.company.step6review;

public class Developer extends Employee implements ICoding {
    private String profession;
    public Developer(String name, float salary,String profession) {
        super(name, salary);
        this.profession=profession;
    }

    public String getProfession() {
        return profession;
    }
}
