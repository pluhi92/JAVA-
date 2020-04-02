package com.zetcode;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionsNUM {

    public static void main(String[] args) {


        List<String> words = List.of("root", "boot",
                "tool", "foot", "nod", "spoon");

        Pattern p = Pattern.compile(".oo.");

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

////////////////////////////////////////////////////////////////////////////////////////////////


package com.zetcode;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionsNUM2 {

    public static void main(String[] args) {


        List<String> words = List.of("root", "boot",
                "tool", "foot", "53452", "123", "nod", "spoon");

        Pattern p = Pattern.compile("[0-9]+"); //Pattern p = Pattern.compile("\\d+");

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
