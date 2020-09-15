package com.pluhi;

import static java.lang.System.out;

import java.io.File;
import java.util.Scanner;

//Create a simple txt file with 10 numbers. Place file to src folder. The numbers make up the number of guests.


public class NumOfGuestsEx {
    public static void main(String[] args) throws java.io.IOException {

        int[] guests = new int[10];
        Scanner sc = new Scanner(new File("src/ListOfGuests.txt"));

        for (int i = 0; i < 10; i++) {
            guests[i] = sc.nextInt();
        }

        out.println("Room number  |\tNumber of guests");
        out.println("-------------------------------");

        for (int i = 0; i < 10; i++) {
            out.print("\t" + i);
            out.print("\t\t\t\t");
            out.println(hosts[i]);
        }
        sc.close();

    }

}
