package com.sky;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String stl,boolean bat,int glr){
        this.style = stl; this.battery=bat;this.globRating=glr;
    }
    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public int getGlobRating() {
        return globRating;
    }

    public boolean isBattery(){return this.battery;}

}
