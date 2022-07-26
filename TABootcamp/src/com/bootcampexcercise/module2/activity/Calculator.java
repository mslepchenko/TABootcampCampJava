package com.bootcampexcercise.module2.activity;

public class Calculator {
    public static void main(String[] args) {

        int x = 10;
        int y = 0;

        int[] nums = {1, 2, 3, 4};

        System.out.println("Addition - " + add(x, y));
        System.out.println("Subtraction - " + subtract(x, y));
        System.out.println("Multiply - " + multiply(x, y));
        System.out.println("Divide - " + divide(x, y));

    }


    private static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    private static int subtract(int x, int y) {
        //TODO implement subtraction
        int sub = x - y;
        return sub;

    }

    private static int multiplyArray(int[] numbers) {
        int temp = 1;

        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }
        return temp;

    }

    private static int multiply(int x, int y) {
        int mul = x * y;
        return mul;

    }

    private static int divide(int x, int y) {
        //TODO write the code
        if (y == 0) {
            System.out.println("Divide by zero is not possible");
            return 0;
        }

        int div = x / y;
        return div;
    }
}
