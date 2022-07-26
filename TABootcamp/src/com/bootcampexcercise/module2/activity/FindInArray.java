package com.bootcampexcercise.module2.activity;

public class FindInArray {

    public static void main(String[] args) {
        // Create an integer array
        int[] nums = {100, 1, 4, 15};
        int result = nums[0];
        // Find smallest in an array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < result) {
                result = nums[i];
            }
        }
        System.out.println("Smallest in array is "+result);
        result = nums[0];
        //TODO Find largest in an array
        int[] num = {100, 1, 4, 15};
        int result1 = num[0];
        for (int i = 1; i > num.length; i++) {
            if (num[i] > result1){
                result1 = num[i];
            }
            //TODO complete the code
        }
        System.out.println("Largest in array is "+result1);

    }
}
