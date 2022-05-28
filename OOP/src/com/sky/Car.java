package com.sky;

public class Car {

    private int doors;
    private int wheels;
    // public String model; Now we will make these private below
    // public String color; because we now have a getter method
    private String model;
    private  String color;
    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }
}
