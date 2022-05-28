package com.sky;

import javax.swing.plaf.IconUIResource;
import java.util.Locale;

public class Truck extends Vehicle{

    private int gears;
    private int loadCapacity,load;
    private int currentGear;

    //public Truck(){}
    public Truck(int gears, int loadCapacity,  int currentGear,int wheels,boolean hasGear) {
        super(wheels,hasGear);
        this.gears = gears;
        this.loadCapacity = loadCapacity;
        //this.load = load;
        this.currentGear = currentGear;
    }

    public void changeGear(int chg){
        if (chg>this.gears || chg<0)
            System.out.println("Invalid gear");
        else {
            this.currentGear=chg;
            System.out.println("Gear changed to "+this.currentGear);
        }
    }
    public void turn(String tn){
        if (tn.toLowerCase()=="right")
            System.out.println("Truck has turned right.");
        else if (tn.toLowerCase()=="left")
            System.out.println("Truck has turned left.");
    }
    @Override
    public void move(int speed){
        super.move(speed);
        System.out.println("Truck has started moving with speed "+speed);
    }

    @Override
    public void brake(){
        super.brake();
        System.out.println("Truck has stopped");
    }

    public void addLoad(int load){
        if (load>this.loadCapacity)
            System.out.println("Load capacity exceeded, max capacity is "+this.loadCapacity);
        else {
            this.load=load;
            System.out.println("Load of "+this.load+" added to truck.");
        }
    }
}
