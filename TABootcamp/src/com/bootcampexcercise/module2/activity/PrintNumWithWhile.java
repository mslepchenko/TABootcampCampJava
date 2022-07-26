package com.bootcampexcercise.module2.activity;

public class PrintNumWithWhile {
    public static void main(String args[]) {
        int n = 100;
        System.out.print("Odd Numbers from 1 to "+n+" are: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
