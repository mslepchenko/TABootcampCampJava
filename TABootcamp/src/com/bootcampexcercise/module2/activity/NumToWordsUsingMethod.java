package com.bootcampexcercise.module2.activity;

public class NumToWordsUsingMethod {
    public static void main(String args[]) {

        int num = 5;
        numToWordsLogic(num);
    }

    public static void numToWordsLogic(int num) {
        //logic of numToWords Class
        switch (num) {
            case 1: {
                printWord("ONE");
                break;
            }
            case 2: {
                printWord("TWO");
                break;
            }
            case 3: {
                printWord("THREE");
                break;
            }
            case 4: {
                printWord("FOUR");
                break;
            }
            case 5: {
                printWord("FIVE");
                break;
            }
            case 6: {
                printWord("SIX");
                break;
            }
            case 7: {
                printWord("SEVEN");
                break;
            }
            case 8: {
                printWord("EIGHT");
                break;
            }
            case 9: {
                printWord("NINE");
                break;
            }
            case 10: {
                printWord("TEN");
                break;
            }
            default: {
                printWord("Given value is not in the range 1-10");
            }
        }
    }

    public static void printWord(String text) {
        System.out.println(text);
    }
}
