package com.zetcode;


public class CycleFor {


    public static void main(String[] args) {

        int[] nums = {7, 9, 2, 6, 12, 10};

        String[] items = {"beers", "coins", "pens", "pencils", "rocks", "cars"};

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("There are %d %s%n", nums[1], items[i]);

        }


    }
}
