package com.zetcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNummers {

    public static void main(String[] args) throws IOException {

        var path = Paths.get("src/resources/data.txt"); //data obsahuju texty, v ktorych nachadzaju roky

        String content = Files.readString(path);
        String content2 = content.replace(".","");

        String[] words = content2.split("\\s");


        Pattern p = Pattern.compile("\\d+");

        for (String word: words) {

            Matcher m = p.matcher(word);

            if (m.matches()) {
                System.out.printf("%s matches%n", word);
            } else {
                System.out.printf("%s does not match%n", word);
            }
        }
    }
}
