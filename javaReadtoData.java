package com.zetcode;

import java.io.*;

public class javaReadtoData {
    public static void main(String[] args) throws IOException {

    var text = "There are clouds in the sky"; // tento text zapisujem do suboru

    byte [] data = text.getBytes();

    try (var fo = new FileOutputStream("src/resources/data.txt")) {

        fo.write(data);

        }
    }
}
