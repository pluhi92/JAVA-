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

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.pluhi;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class NumOfGuestsEx2 {
    public static void main(String[] args) throws java.io.IOException {

        int guests[] = new int[10];
        int gRoom;

        Scanner sc = new Scanner(new File("src/GuestList.txt"));
        for (gRoom = 0; gRoom < 10; gRoom++) {
            guests[gRoom] = sc.nextInt();
        }
        sc.close();

        gRoom = 0;
        while (gRoom < 10 && guests[gRoom] != 0) {
            gRoom++;
        }
        if (gRoom == 10) {
            System.out.println("The hotel is unfortunately full");
        } else {
            System.out.print("How many people ");
            System.out.print("should I book room ");
            System.out.print(gRoom + ". for");

            Scanner sc1 = new Scanner(System.in);
            guests[gRoom] = sc1.nextInt();
            sc1.close();

            PrintStream updatedList = new PrintStream("src/GuestList.txt");
            for (gRoom = 0; gRoom < 10; gRoom++) {
                updatedList.print(guests[gRoom]);
                updatedList.print(" ");
            }
            updatedList.close();
        }
    }
}
