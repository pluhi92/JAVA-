package com.zetcode;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class HTMLBodyOut {
    public static void main(String[] args) throws IOException {

        String url = "http://webcode.me";

        Document doc = Jsoup.connect(url).get();
        String title = doc.title();
        System.out.println(title);

        System.out.println(doc.body().child(0));
        System.out.println(doc.body().child(1)); //.text = len text bey p=cka
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////


package com.zetcode;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class HTMLBodyOut2 {
    public static void main(String[] args) throws IOException {

        String url = "http://webcode.me";

        Document doc = Jsoup.connect(url).get();
        Element body = doc.body();
        System.out.println(body);
        

    }
}

