package com.zetcode;

public class ThisKeyword {
    public static void main(String[] args) {

        A obj = new A(6);
        obj.show();

    }
}

class A {

    private int x;            //Instance

    public A(int x) {         //Local

        this.x = x;           //Current Instance
    }

    public void show() {
        System.out.println("The value of x is " + x);

    }
}
