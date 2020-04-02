package com.zetcode;


public class caseDefault {


    public static void main(String[] args) {


        String msg = "Today is a beautiful day";
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;

        char[] letters = msg.toCharArray();

        for (char letter : letters) {
            switch (letter) {
               case 'a', 'e', 'i', 'o', 'u', 'y' -> vowels++;
               case ' ' -> spaces++;
               default -> consonants++;
            }
        }
         System.out.printf("Vowels: %d%n", vowels);
        System.out.printf("Consonants: %d%n", consonants);
        System.out.printf("Spaces: %d%n", spaces);
  }
}
