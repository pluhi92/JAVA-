package com.zetcode;

public class ShallowEx {
    public static void main(String[] args) {

        Abc obj = new Abc();

        obj.i = 5;
        obj.j = 6;

        Abc obj1 = obj;

        obj1.j = 8;

        System.out.println(obj1);          //5, 8
        System.out.println(obj);           //5, 8
    }
}

class Abc {
    int i;
    int j;

    @Override
    public String toString() {
        return "Abc{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}
