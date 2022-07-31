package com.bootcampexcercise.practice;

public class CarFactory {

    public void ChangeByValue(int serialNumber) {

        serialNumber = 112233;
    }

    public void ChangeByReference(Car car) {

        car.serialNumber = 112233;
    }
}
