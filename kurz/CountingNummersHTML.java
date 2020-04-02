package com.zetcode;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class CountingNummersHTML {
    public static void main(String[] args) throws IOException {

        String url = "http://test.webcode.me/data.txt";

        Document doc = Jsoup.connect(url).get();

        String content = doc.body().text();
        System.out.println(content);

//the program reads data from web page

        String[] vals = content.split(",\\s+");

        int sum = 0;

        for (String val : vals) {

            if (isNumeric(val)) {

                sum += Integer.parseInt(val);
            }

        }
        System.out.println(sum);
    }

    public static boolean isNumeric(String val) {

        int len = val.length();

        for (int i = 0; i < len; i++)

            if (!Character.isDigit(val.charAt(i))) {

                return false;

            }

        return true;
    }
}

