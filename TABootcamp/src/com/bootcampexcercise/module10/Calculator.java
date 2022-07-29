package com.bootcampexcercise.module10;

public class Calculator {

    public static int add(short x, short y) {
        int sum = (int)x + (int)y;
        return sum;
    }

    public static long add(int x, int y) {
        long sum = (long)x + (long)y;
        return sum;
    }

    public static long subtract(int x, int y) {
        int sub = x - y;
        return sub;
    }

    public static int divide(int x, int y) throws ArithmeticException {
        try{
            int result = x / y;
            return result;
        }
        catch (ArithmeticException e) {
            System.out.println ("A number cannot be divided by zero " + e);
            throw new ArithmeticException("A number cannot be divided by zero");
        }
    }

    public static long multiply(int x, int y) throws NegativeValueException, ArithmeticException {
        try {
            if (x < 0 || y < 0) {
                throw new NegativeValueException("Only positive numbers are allowed");
            }

            long result = (long)x * (long)y;
            return result;
        }
        catch (NegativeValueException e) {
            System.out.println(e);
            throw e;
        }
    }
}
