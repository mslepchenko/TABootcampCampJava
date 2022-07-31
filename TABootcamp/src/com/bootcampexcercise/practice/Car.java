package com.bootcampexcercise.practice;

public class Car {

    public Car() {

    }

    public Car(String model) {

    }

    public Car(String model, int maxSpeed) {

    }

    private String HolderName;

    public static int wheelsNumber = 4;
    public int serialNumber;
    public int speed;

    public String model;

    public static String WrumWrum(boolean isFerrari)
    {
        int test = 0;

        if (isFerrari == true) {
            return "Wrum Wrum, rich man!";
        }

        return "Wrum Wrum, poor man!";
    }

    public void BipBip(){
        System.out.println("Bip Bip!");

    }
}


