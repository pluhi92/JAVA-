package com.zetcode;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindHTML {

    public static void main(String[] args) throws IOException {


        String content = "<p>The <code>Pattern</code> is a compiled "
                + "representation of a regular expression.</p> </html>";

        Pattern p = Pattern.compile("(</?[a-z]*>)");

        Matcher matcher = p.matcher(content);

        while (matcher.find()) {

            System.out.println(matcher.group(1));
        }
    }
}
