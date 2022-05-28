package com.sky;

public class Vehicle {
    private int wheels;
    private boolean hasGear;
    //public Vehicle(){}
    public Vehicle(int wheels,boolean hasGear){
        this.wheels = wheels;
        this.hasGear = hasGear;
    }
    public void move(int speed){
        System.out.println("Vehicle has started moving.");
    }

    public void brake(){
        System.out.println("Vehicle has stopped");
    }
}
