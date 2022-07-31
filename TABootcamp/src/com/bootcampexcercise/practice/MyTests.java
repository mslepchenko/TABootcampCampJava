package com.bootcampexcercise.practice;

import com.bootcampexcercise.practice.Car;

public class MyTests {

    public static void main(String[] args) {
        //CarFactory myCarFactory = new CarFactory();
        var myCarFactory = new CarFactory();

        int serialNumber = 0;
        System.out.println("Serial number before change " + serialNumber);

        myCarFactory.ChangeByValue(serialNumber);

        System.out.println("Serial number after change " + serialNumber);

        var myCar = new Car();
        myCar.serialNumber = 0;
        System.out.println("Car Serial number before change " + myCar.serialNumber);

        myCarFactory.ChangeByReference(myCar);

        System.out.println("Car Serial number before change " + myCar.serialNumber);

        SwitchCase("Margo");
        SwitchCase("Vova");
        SwitchCase("Andrej");
    }

    public static void SwitchCase(String name) {
        System.out.println("If else");

        if (name == "Margo") {
            System.out.println("Margo is beatiful");
        } else if (name == "Vova") {
            System.out.println("Vova is high");
        } else {
            System.out.println("Hz kto");
        }

        System.out.println("\n\nSwitch case");

        switch (name) {
            case "Margo":
                System.out.println("Margo is beatiful");
                break;
            case "Vova":
                System.out.println("Vova is high");
                break;
            default:
                System.out.println("Hz kto");
        }
    }
}
