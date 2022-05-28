package com.sky;

import java.util.zip.CheckedInputStream;

public class Rectangle {
    private double length,width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        if (width<0)
            this.width=0;
        if (length<0)
            this.length=0;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }
    public double getArea(){return this.getLength()*this.getWidth();}
}
