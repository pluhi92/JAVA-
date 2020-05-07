package com.zetcode;

public class Polymorphism {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();                 //values for example --> () or 4(int) or 5.5(double)
    }
}
class A {
    public void show() {

        System.out.println("Hello A");
    }
    public void show(int i) {
        System.out.println("Hello " + i);
    }
    public void show(double d) {
        System.out.println("Hello " + d);
    }
}

