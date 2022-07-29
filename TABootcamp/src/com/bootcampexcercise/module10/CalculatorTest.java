package com.bootcampexcercise.module10;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private Calculator theCalculator;

    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        theCalculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        theCalculator = null;
        super.tearDown();
    }

    public void testAddShort_PositiveValues() {

        short a = 5;
        short b = 10;
        //	Checks the sum of two (2) positive values
        assertEquals(15, (theCalculator.add(a, b)));
        assertEquals(15, (theCalculator.add(b, a)));
    }

    public void testAddShort_NegativeValues() {

        short a = -5;
        short b = -10;
        //	Checks the sum of two (2) positive values
        assertEquals(-15, (theCalculator.add(a, b)));
        assertEquals(-15, (theCalculator.add(b, a)));
    }

    public void testAddShort_MaxValues() {

        short a = 32767;
        short b = 32767;
        //	Checks the sum of two (2) positive values
        assertEquals(65534, (theCalculator.add(a, b)));
        assertEquals(65534, (theCalculator.add(b, a)));
    }

    public void testAddShort_MinValues() {

        short a = -32768;
        short b = -32768;
        //	Checks the sum of two (2) positive values
        assertEquals(-65536, (theCalculator.add(a, b)));
        assertEquals(-65536, (theCalculator.add(b, a)));
    }

    public void testAddInt_PositiveValues() {

        int a = 5;
        int b = 10;
        //	Checks the sum of two (2) positive values
        assertEquals(15, (theCalculator.add(a, b)));
        assertEquals(15, (theCalculator.add(b, a)));
    }

    public void testAddInt_NegativeValues() {

        int a = -5;
        int b = -10;
        //	Checks the sum of two (2) positive values
        assertEquals(-15, (theCalculator.add(a, b)));
        assertEquals(-15, (theCalculator.add(b, a)));
    }

    public void testAddInt_MaxValues() {

        int a = 2147483647;
        int b = 2147483647;
        //	Checks the sum of two (2) positive values
        assertEquals(4294967294l, (theCalculator.add(a, b)));
        assertEquals(4294967294l, (theCalculator.add(b, a)));
    }

    public void testAddInt_MinValues() {

        int a = -2147483648;
        int b = -2147483648;
        //	Checks the sum of two (2) positive values
        assertEquals(-4294967296l, (theCalculator.add(a, b)));
        assertEquals(-4294967296l, (theCalculator.add(b, a)));
    }


    public void testSubtract_PositiveValues() {

        int a = 100;
        int b = 50;
        //	Checks the sum of two (2) positive values
        assertEquals(50, (theCalculator.subtract(a, b)));
        assertEquals(-50, (theCalculator.subtract(b, a)));
    }

    public void testSubtract_NegativeValues() {

        int a = -100;
        int b = -50;
        //	Checks the sum of two (2) positive values
        assertEquals(-50, (theCalculator.subtract(a, b)));
        assertEquals(50, (theCalculator.subtract(b, a)));
    }

    public void testSubtract_MinValues() {

        int a = -2147483648;
        int b = -2147483648;
        //	Checks the sum of two (2) positive values
        assertEquals(0, (theCalculator.subtract(a, b)));
        assertEquals(0, (theCalculator.subtract(b, a)));
    }

    public void testDivide_PositiveValues() {
        int a = 6;
        int b = 2;

        assertEquals(3, (theCalculator.divide(a, b)));
    }

    public void testDivide_NegativeValues() {
        int a = -6;
        int b = 2;

        assertEquals(-3, (theCalculator.divide(a, b)));
    }

    public void testDivide_DividentIsZero() {
        int a = 0;
        int b = 2;

        assertEquals(0, (theCalculator.divide(a, b)));
    }


    public void testDivide_DivideByZero_ThrowsException() {
        int a = 6;
        int b = 0;

        try {
            theCalculator.divide(a, b);
            fail();
        } catch (ArithmeticException e) {
            assertEquals("A number cannot be divided by zero", e.getMessage());
        }
    }

    public void testMultiply_PositiveValues() {
        int a = 5;
        int b = 10;

        try {
            assertEquals(50, theCalculator.multiply(a, b));
        } catch (NegativeValueException e) {
            fail();
        }
    }

    public void testMultiply_NegativeValues_ThrowsException() {
        int a = -5;
        int b = -10;

        try {
            assertEquals(50, theCalculator.multiply(a, b));
            fail();
        } catch (NegativeValueException e) {
            assertEquals("Only positive numbers are allowed", e.getMessage());
        }
    }

    public void testMultiply_MaxValues_ThrowsException() {
        int a = 2147483647;
        int b = 2147483647;

        try {
            assertEquals(4611686014132420609l, theCalculator.multiply(a, b));
        } catch (NegativeValueException e) {
            fail();
        }
    }
}
