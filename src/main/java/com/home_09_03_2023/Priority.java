package com.home_09_03_2023;

public enum Priority {
    LOW("Low"),
    MEDIUM("Medium"),
    HIGH("high") ,
    CRITICAL("critical");

    private String s;

    Priority(String s) {
        this.s = s;
    }
    public String getS(){
        return s;
    }
}
