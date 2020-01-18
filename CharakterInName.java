package com.zetcode;

import java.util.ArrayList;
import java.util.List;

// latin characters only

public class CharakterInName {

    public static void main(String[] args) {

        List<String> martialArts = new ArrayList<>();
        martialArts.add("Silat");
        martialArts.add("Wing chun");
        martialArts.add("Karate");
        martialArts.add("Judo");
        martialArts.add("Aikido");



        martialArts.forEach((e) -> {
            System.out.printf("%s has %d letters%n", e, e.length());
        });

        System.out.print("\n");
    }
}
