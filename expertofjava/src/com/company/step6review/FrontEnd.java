package com.company.step6review;

public class FrontEnd extends Developer{
    private boolean frontTaskStatus;
    public FrontEnd(String name, float salary, String profession,boolean frontTaskStatus) {
        super(name, salary, profession);
        this.frontTaskStatus=frontTaskStatus;
    }

    public boolean getFrontTaskStatus() {
        return frontTaskStatus;
    }
}
