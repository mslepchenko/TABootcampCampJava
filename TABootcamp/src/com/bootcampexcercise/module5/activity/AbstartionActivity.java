package com.bootcampexcercise.module5.activity;

public class AbstartionActivity {

    public static void main(String[] args) {

        Square mySquare = new Square(5);
        mySquare.color = "black";

        System.out.println("Square Color:" + mySquare.color);
        System.out.println("Square Area:" + mySquare.calculateArea());
        System.out.println("Square Perimeter:" + mySquare.calculatePerimeter());

        Rectangle myRectangle = new Rectangle(5,6);
        myRectangle.color = "pink";

        System.out.println("\nRectangle Color:" + myRectangle.color);
        System.out.println("Rectangle Area:" + myRectangle.calculateArea());
        System.out.println("Rectangle Perimeter:" + myRectangle.calculatePerimeter());


    }
}
