package com.zetcode;

import java.io.*;

public class Serialization {
    public static void main(String[] args) throws Exception {

        Save obj = new Save();
        obj.i = 4;

        File f = new File("object.txt");

        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);


        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Save obj1 = (Save) ois.readObject();
        System.out.println("Value of obj1: " + obj1.i);


    }
}

class Save implements Serializable {
    int i;
}
