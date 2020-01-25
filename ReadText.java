package com.zetcode;


import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class ReadText {

    public static void main(String[] args) throws IOException {

        String fileName = "src/resources/data.txt";
        String content = readTextFile(fileName);
        System.out.println(content);
    }


        private static String readTextFile(String fileName) throws IOException {
            char[] buf = new char[1024];

            try (var fr = new FileReader(fileName, StandardCharsets.UTF_8)) {

                int readChars = fr.read(buf);

                if (readChars > 0) {
                    System.out.println(buf);
                }
            }

            return new String(buf);
        }
    }
