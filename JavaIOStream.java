package com.zetcode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

    public class JavaIOStreamEx {
        public static void main(String[] args) throws IOException {

            FileInputStream is = null;
            FileOutputStream os = null;

            try {
                is = new FileInputStream("src/resources/data.txt");
                os = new FileOutputStream("src/resources/data2.txt"); ///to samostantne vytvori
                int c;

                while ((c = is.read()) != -1) {
                    os.write(c);
                }
            } finally {
                if (is != null) {
                    is.close();
                }
                if (os != null) {
                    os.close();
                }
            }
        }
    }
//////////////////////////////////////////////////////////////////////////////////////
ZJEDNODUSENA VERZIA


package com.zetcode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaIOStreamEx2 {
    public static void main(String[] args) throws IOException {

        try (var is = new FileInputStream("src/resources/data.txt");
             var os = new FileOutputStream("src/resources/data2.txt")) {
            int c;

            while ((c = is.read()) != -1) {
                os.write(c);
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////

PRACA S BYTAMI ---> SKOPIROVANIE SUBORU

package com.zetcode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaIOStreamEx {
    public static void main(String[] args) throws IOException {


        long start = System.currentTimeMillis();

        try (var is = new FileInputStream("C:/Users/admin/Downloads/freebsd.img.xz");
             var os = new FileOutputStream("C:/Users/admin/Downloads/freebsd2.img.xz")) {

            int c;

            byte[] buf = new byte[1024];

            while ((c = is.read(buf)) != -1) {

                os.write(buf);
            }
        }
        long end = System.currentTimeMillis();
        long dif = end - start;
        System.out.printf("Elapsed time: %d s%n", dif / 1000); //tu vypisuje za kolko casu vykonal skopirovanie
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Druha varianta

package com.zetcode;

import java.io.*;

public class JavaIOStreamEx {
    public static void main(String[] args) throws IOException {


        long start = System.currentTimeMillis();

        try (var br = new BufferedInputStream(new FileInputStream("C:/Users/admin/Downloads/freebsd.img.xz"));
             var bo = new BufferedOutputStream(new FileOutputStream("C:/Users/admin/Downloads/freebsd2.img.xz"))) {

                 byte[] buf = new byte[1024];

                 while (br.read(buf)!= -1) {

                     bo.write(buf);
                 }
             }

        long end=System.currentTimeMillis();

        long dif = end - start;

        System.out.printf("Elapsed time: %d s%n", dif);
    }
}

