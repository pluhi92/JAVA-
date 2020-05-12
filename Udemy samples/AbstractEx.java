package com.zetcode;

public class AbstractEx {
    public static void main(String[] args) {

        ApplePhone obj = new HuaweiPhone();
        obj.call();
        obj.cook();
        obj.move();
        obj.dance();
        
    }
}

abstract class ApplePhone {   //Abstract class
    public void call() {
        System.out.println("calling...");
    }

    public abstract void move();  //Abstract methods

    public abstract void dance();

    public abstract void cook();
}

abstract class SamsungPhone extends ApplePhone {
    public void move() {
        System.out.println("Moving...");
    }
}

class HuaweiPhone extends SamsungPhone {           //Concrete
    public void dance() {
        System.out.println("Dancing...");
    }

    public void cook() {
        System.out.println("Cooking...");
    }
}
