package com.zetcode;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class CountingNummersHTML2 {
    public static void main(String[] args) throws IOException {

        String url = "http://test.webcode.me/data.txt";

        Document doc = Jsoup.connect(url).get();

        String content = doc.body().text();
        System.out.println(content);

        // Element body = doc.body();
       // System.out.println(body.text());


        String[] vals = content.split(",\\s+");

           int sum = 0;

           for (String val : vals) {

               sum += Integer.parseInt(val);

           }
            System.out.println(sum);
    }
}

