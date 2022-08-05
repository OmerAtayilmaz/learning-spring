package com.company.step6review;

public class BackEnd extends Developer{
    private boolean backendTaskStatus;

    public BackEnd(String name, float salary, String profession, boolean backendTaskStatus) {
        super(name, salary, profession);
        this.backendTaskStatus = backendTaskStatus;
    }

    public boolean isBackendTaskStatus() {
        return backendTaskStatus;
    }
}
