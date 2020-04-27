package com.zetcode;

import java.io.IOException;

public class AsciiCode {

    public static void main(String[] args) throws IOException {

        int kar1;
        int kar2;
        int kar3;
        int kar4;
        int kar5;
        char ckar1;
        char ckar2;
        char ckar3;
        char ckar4;
        char ckar5;

        System.out.println("Write 5 characters: ");
        kar1 = System.in.read();
        ckar1 = (char) kar1;
        kar2 = System.in.read();
        ckar2 = (char) kar2;
        kar3 = System.in.read();
        ckar3 = (char) kar3;
        kar4 = System.in.read();
        ckar4 = (char) kar4;
        kar5 = System.in.read();
        ckar5 = (char) kar5;


        System.out.println("Scanned characters: " + ckar1 + ckar2 + ckar3 +
                ckar4 + ckar5);
        System.out.println("The ASCII code of your characters is: " + kar1 + kar2
        + kar3 + kar4 + kar5);
        
    }
}
