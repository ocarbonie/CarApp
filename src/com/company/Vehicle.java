package com.company;

public class Vehicle {

    private String color;
    private int speed;

    public Vehicle() {
    }

    //Methods for color
    public void setColor(String d) {
        this.color = d;
    }

    public String getColor() {
        return color;
    }

    //Methods for Speed
    public void setSpeed(int c) {
        this.speed = c;
        System.out.println("The Speed is " + speed + "mph");
    }


}

