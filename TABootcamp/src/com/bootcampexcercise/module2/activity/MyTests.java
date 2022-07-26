package com.bootcampexcercise.module2.activity;

public class MyTests {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        int serialNumber = 0;
        System.out.println("Serial number before change " + serialNumber);

        carFactory.ChangeByValue(serialNumber);

        System.out.println("Serial number after change " + serialNumber);


        Car myCar = new Car();
        myCar.serialNumber = 0;
        System.out.println("Car Serial number before change " + myCar.serialNumber);

        carFactory.ChangeByReference(myCar);

        System.out.println("Car Serial number before change " + myCar.serialNumber);
    }
}
