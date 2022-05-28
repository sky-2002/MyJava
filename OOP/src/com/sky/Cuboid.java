package com.sky;

public class Cuboid extends Rectangle{
    private double height;
    public Cuboid(double height,double length,double width){
        super(length,width);
        this.height=height;
        if (height<0)
            this.height=0;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){return this.height*this.getArea();}
}
