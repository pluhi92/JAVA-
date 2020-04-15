package com.zetcode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class EnglishHungarianDic {

    public static void main(String[] args) throws IOException {

        String[] english = {"one", "two", "three", "for", "five", "six", "seven",
                "eight", "nine", "ten"};
        String[] hungarian = {"egy", "ketto", "harom", "negy", "ot", "hat", "het",
                "nyolc", "kilenc", "tiz"};

        Properties pl = new Properties();
        File szf = new File("Dictionary.txt");

        if (!szf.exists()) {
            for (int i = 0; i < english.length; i++)
                pl.put(english[i], hungarian[i]);
            FileOutputStream tf = new FileOutputStream("Dictionary.txt");
            pl.store(tf, "English/Hungarian dictionary");
            System.out.println("The file has been created.");
        } else {
            FileInputStream gf = new FileInputStream("Dictionary.txt");
            pl.load(gf);
            System.out.println("The file has been loaded");
        }

        translate(pl, new String[]{"one"});
    }

    static void translate(Properties d, String[] words) {
        for (int i = 0; i < words.length; i++)
            System.out.println(d.get(words[i]) + "\t");
        System.out.println();
    }
}

//You can add more words to the file (Dictionary.txt).
