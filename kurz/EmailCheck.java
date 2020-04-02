package com.zetcode;


import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class EmailCheck {


    public static void main(String[] args)  {


        List<String> emails = Arrays.asList("luke@gmail.com",
                "andy@yahoocom", "34234sdfa#2345", "f344@gmail.com");

        String regex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,18}$";

        Pattern p = Pattern.compile(regex);

        for (String email : emails) {

            Matcher m = p.matcher(email);

            if (m.matches()) {
                System.out.printf("%s matches%n", email);
            } else {
                System.out.printf("%s does not match%n", email);
            }
        }
    }
}
