package com.zetcode;

import java.io.*;
import java.net.URL;

public class DownloadJPEG {
    public static void main(String[] args) throws IOException {

        var url_path = "http://webcode.me/favicon.ico";

        var url = new URL(url_path);

        try (var is = url.openStream();
        var fo = new FileOutputStream("src/resources/favicon.ico")){

        byte[] data = is.readAllBytes();

            fo.write(data);

        }
    }
}
