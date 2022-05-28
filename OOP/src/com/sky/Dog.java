package com.sky;

public class Dog extends Animal{
    private int eyes,legs,teeth,tail;
    private String coat;

    public Dog( int size, int weight, String name, int eyes, int legs, int teeth, int tail, String coat) {
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.tail = tail;
        this.coat = coat;
    }
}
