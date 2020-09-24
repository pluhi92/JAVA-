package com.pluhi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

public class RandomNumsWr {
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("src/TestData.txt");
        PrintStream ps = new PrintStream(f);

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int answer = r.nextInt(100) + 1;
            System.out.print(" |" + answer + "| ");
            ps.print(" |" + answer + "| ");
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------|");
        ps.println();
        ps.println("-----------------------------------------------------------|");

        Random r1 = new Random();
        for (int j = 0; j < 10; j++) {
            int answer1 = r1.nextInt(100) + 1;
            System.out.print(" |" + answer1 + "| ");
            ps.print(" |" + answer1 + "| ");
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------|");
        ps.println();
        ps.println("-----------------------------------------------------------|");

        Random r2 = new Random();
        for (int k = 0; k < 10; k++) {
            int answer2 = r2.nextInt(100) + 1;
            System.out.print(" |" + answer2 + "| ");
            ps.print(" |" + answer2 + "| ");
        }
    }
}
