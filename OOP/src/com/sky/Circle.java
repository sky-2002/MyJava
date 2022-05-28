package com.sky;

import com.sun.source.tree.BreakTree;

public class Circle {
    private double radius;
    public Circle(double rad){
        if (rad<0)
            this.radius=0;
        else
            this.radius=rad;
    }
    public double getRadius(){return this.radius;}
    public double getArea(){return Math.PI*this.radius*this.radius;}
}
