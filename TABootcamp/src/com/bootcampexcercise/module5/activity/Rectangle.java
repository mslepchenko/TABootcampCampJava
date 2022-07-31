package com.bootcampexcercise.module5.activity;

public class Rectangle extends Shape {

    private double length;
    private double breadth;

    public Rectangle () {

    }

    public Rectangle ( double length, double breadth) {

        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle ( double length, double breadth, String color) {

        this.length = length;
        this.breadth = breadth;
        this.color = color;
    }

    public double calculateArea() {
        double s = length * breadth;
        return s;
    }
    public double calculatePerimeter(){
        double p = 2 * (length + breadth);
        return p;
    }

}
