package com.company;

public class Car extends Vehicle{
    private String make;
    private String model;

    public Car(){
    }
    public Car(String m, String n) {
        super();
        this.make = m;
        this.model = n;
    }
    public void setMake(String s){
        this.make = s;
    }
    public String getMake(){
        return make;
    }
    public void setModel(String p){
        this.model = p;
    }
    public String getModel(){
        return model;
    }

    public String getEmission(){
        return ("The "+ super.getColor()+ " " + model +
                " has stopped to have its emissions checked");
    }
    public void hasPassedEmission(boolean b){
        if(b)
            System.out.println("The "+ super.getColor()+ " " + model +
                    " has passed its emission test");
        else
            System.out.println("The "+ super.getColor()+ " " + model +
                    " has not passed its emission test");
    }
    public  String passingCars( Car f){
        return ("The " + this.getColor()+ " " + model + " just passed the " + f.getColor()+ " " + model);
    }
    //Methods for acceleration
    public void acceleration(boolean m){
    if(m)
        System.out.println("The " +super.getColor()+ " " + model + " is accelerating");
    else
        System.out.println("The " +super.getColor()+ " " + model + " is decelerating");

}
    //Method for stop
    public void isStarting(boolean m){
        if(m)
            System.out.println("The "+ super.getColor()+ " " + model + " is starting");
        else
            System.out.println("The "+ super.getColor()+ " " + model + " is stopped");

    }










}
