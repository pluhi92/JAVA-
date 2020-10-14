package com.pluhi;

import java.util.Scanner;

public class StringToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First name, then Last name: ");
       
        String s;             //First name
        String s1;             //Last name
        s = sc.next();
        s1 = sc.next();

        byte[] bytes = s.getBytes();
        StringBuilder binary = new StringBuilder();

        for (byte b : bytes) {

            int val = b;

            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(' ');
        }
        System.out.println("'" + s + "' to binary: " + binary);
        System.out.println("'" + s1 + "' to binary: " + binary);
    }
}


