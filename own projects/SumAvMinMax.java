package com.zetcode;

public class SumAvMinMax {

    public static void main(String[] args) {

        int[] a = {3, 5, 2, 1, 8, 9, 12, 11, 7, 6};

//SUM
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];

        }
        System.out.println("The sum of numbers is: " + sum);
//AVERAGE
        double average = (double) sum / a.length;
        System.out.println("The average of numbers is: " + average);
//MIN
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("The min number is: " + min);
//MAX
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max) {
                max = a[i];
            }
        System.out.println("The max number is: " + max);
        System.out.println("...........................");

        System.out.println("The number of elements is: " + a.length);
    }

}
