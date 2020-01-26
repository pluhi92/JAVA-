
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadImage {
    public static void main(String[] args) throws IOException {

        var path = Paths.get("src/resources/favicon.ico");

        byte[] data = Files.readAllBytes(path);
        int i = 0;

        for (byte c : data) {

            System.out.printf("%02x ", c);

            i++;

            if (i % 16 == 0) {

            System.out.println();
            }
        }
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.zetcode;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadImage2 {
    public static void main(String[] args) throws IOException {

        try (FileInputStream fis = new FileInputStream("src/resources/favicon.ico")) {

            byte[] data = fis.readAllBytes();

            int i = 0;

            for (byte b : data) {

                System.out.printf("%02x ", b);
                i++;

                if (i % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}


