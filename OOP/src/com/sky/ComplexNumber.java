package com.sky;

public class ComplexNumber {
    private double real,imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    public void add(double real,double imaginary){
        this.real+=real;
        this.imaginary+=imaginary;
    }
    public void add(ComplexNumber c){
        this.real+=c.real;
        this.imaginary+=c.imaginary;
    }
    public void subtract(double real,double imaginary){
        this.real-=real;
        this.imaginary-=imaginary;
    }
    public void subtract(ComplexNumber c){
        this.real-=c.real;
        this.imaginary-=c.imaginary;
    }
}
