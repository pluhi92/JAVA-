package com.zetcode;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Read a number between 1 and 3:  ");

        int enteredNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(3);

        if (enteredNumber == randomNumber) {
            System.out.println("...............");
            System.out.println("You're win!");
            System.out.println("...............");

        } else {

            System.out.println("You're lost!");
            System.out.print("The random number is: ");
            System.out.println(randomNumber + ".");
        }

        System.out.println("Thanks for the game.");

        keyboard.close();

    }
}
