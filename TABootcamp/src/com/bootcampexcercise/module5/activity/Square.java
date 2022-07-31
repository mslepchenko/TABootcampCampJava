package com.bootcampexcercise.module5.activity;

public class Square extends Shape{

   private double side;
    public Square () {

    }

    public Square ( double side) {

        this.side = side;

    }

    public Square ( double side, String color) {

        this.side = side;
        this.color = color;
    }

    public double calculateArea() {
        double s = side * side;
        return s;
    }
    public double calculatePerimeter(){
        double p = side * 4;
        return p;
    }

}
