package com.sky;

public class T1 extends Truck{
    private String name;

    public T1(String name,int gears,int loadCapacity,int currentGear,int wheels,boolean hasGear) {
        super(gears,loadCapacity,currentGear,wheels,hasGear);
        this.name = name;
    }

    @Override
    public void move(int speed){
        super.move(speed);
        System.out.println(this.name+" has started moving with speed "+speed);
    }
    @Override
    public void brake(){
        super.brake();
        System.out.println(this.name+" has stopped.");
    }
}
