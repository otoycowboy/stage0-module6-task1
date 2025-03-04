package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String colorInfo = "This animal is mostly " + color;
        String pawsInfo = ". It has " + numberOfPaws + ((numberOfPaws == 1) ? " paw " : " paws ");
        String furInfo = "and " + ((hasFur) ? "a" : "no") + " fur.";
        return colorInfo + pawsInfo + furInfo;
    }
}
