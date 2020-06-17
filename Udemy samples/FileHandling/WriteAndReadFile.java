package com.zetcode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteAndReadFile {
    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("pluhi.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("This is Spartaaaaa!!!");

        FileInputStream fis = new FileInputStream("pluhi.txt");
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);
    }
}

