package com.zetcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Filebytes {

    public static void main(String[] args) throws IOException {

        var path = Paths.get("src/resources/thermopylae.txt");

        long fileSize = Files.size(path);

        System.out.printf("The file has %d bytes", fileSize);


    }
}
