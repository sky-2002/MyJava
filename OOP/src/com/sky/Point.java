package com.sky;

public class Point {
    private int x,y;

    // Constructor with arguments
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // No argument constructor
    public Point(){}

    public double distance(){
        return (double) Math.sqrt(this.x*this.x + this.y*this.y);
    }
    public double distance(Point p2){
        return (double) Math.sqrt((this.x-p2.x)*(this.x-p2.x) + (this.y-p2.y)*(this.y-p2.y));
    }
    public double distance(int x,int y){
        return Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y));
    }
}
