package com.zetcode;


import java.util.List;

public class bigCharacters {


    public static void main(String[] args) {

        List<String> words = List.of("rock", "forest", "sky", "cloud", "water");

       int i = 0;

       while (i < words.size()) {

           String word = words.get(i);

           System.out.println(word.toUpperCase());

           i++;

       }

    }
}
