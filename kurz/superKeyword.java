package com.zetcode;

class Shape {

    int x = 50;
    int y = 51;
}

class Rectangle extends Shape {

    int x = 100;
    int y = 101;

    public void info() {

        System.out.println(x);
        System.out.println(y);
        System.out.println(super.x);
        System.out.println(super.y);
    }
}

public class superKeyword {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.info();
    }
}
