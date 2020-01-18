package com.zetcode;


public class StarNummer {


    public static void main(String[] args) {

     int[] nums = {7, 9, 2, 6, 12, 10};

     String unit = "*";

        for (var num: nums) {
            System.out.println(unit.repeat(num));
        }
    }
}
