package com.zetcode;


import java.util.List;

public class SumCharacters {


    public static void main(String[] args) {

        List<String> words = List.of("rock", "forest", "sky", "cloud", "water");

        int nOfChars = 0;

        for (String word : words) {

            nOfChars += word.length();
        }

        System.out.println(nOfChars);

    }
}
