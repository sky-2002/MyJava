package com.sky;

public class Bedroom {
    private String name;
    private Ex37_Wall wall1,wall2,wall3,wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Ex37_Wall wall1, Ex37_Wall wall2, Ex37_Wall wall3, Ex37_Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }
    public Lamp getLamp(){return this.lamp;}
    public void makeBed(){
        System.out.println("Bedroom -> Making bed | ");
        this.bed.make();
    }
}
