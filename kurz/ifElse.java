package com.zetcode;


public class ifElse {


    public static void main(String[] args) {


        String msg = "Today is a beautiful day";
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;

        char[] letters = msg.toCharArray();

        for (char letter : letters) {

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter =='y'){

                vowels++;

            } else if (letter == ' ') {
                spaces++;

            } else {
                consonants++;

            }
        }
        System.out.printf("Vowels: %d%n", vowels);
        System.out.printf("Consonants: %d%n", consonants);
        System.out.printf("Spaces: %d%n", spaces);

    }
}


