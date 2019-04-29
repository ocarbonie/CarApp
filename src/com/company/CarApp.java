package com.company;

public class CarApp {
    public static void main(String[]args){

        Car a = new Car();
        Car b = new Car();
        a.setColor("red");
        b.setColor("blue");
        a.setModel("Porshe");
        b.setModel("Jetta");
        a.isStarting(true);
        b.isStarting(false);
        a.acceleration(true);
        b.acceleration(true);
        System.out.println(b.getEmission());
        b.hasPassedEmission(true);
        a.setSpeed(50);
        a.isStarting(false);
        System.out.println(a.passingCars( b));
        System.out.println(b.passingCars(a));




    }
}
