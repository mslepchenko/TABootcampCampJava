package com.bootcampexcercise.module10;

public class InterfaceActivityClass {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();

        System.out.println("Start vehicles:");
        bike.start();
        car.start();

        System.out.println("\nStop vehicles:");
        bike.stop();
        car.stop();
    }
}
