package com.zetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumAv {
    public static void main(String[] args) throws IOException {

        BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("data: ");
        String data = be.readLine(), a;
        StringTokenizer select = new StringTokenizer(data);
        int db = select.countTokens();
        int[] x = new int[db];
        int i = 0;
        while (i < db) {
            a = select.nextToken();
            x[i] = Integer.valueOf(a).intValue();
            System.out.println(i + ". num: " + x[i]);
            i++;
        }
        int sum = 0;
        double average;
        i = 0;
        while (i < db)
            sum += x[i++];
        average = (double) sum / db;
        System.out.println("sum: " + sum);
        System.out.println("average: " + average);
        
    }

}
