package com.sky;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(double rad,double hei){
        super(rad);
        if (hei<0)
            this.height=0;
        else
            this.height=hei;
    }

    public double getHeight(){return this.height;}
    public double getVolume(){return this.height*this.getArea();}
}
