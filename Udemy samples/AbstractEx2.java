package com.zetcode;

public class AbstractEx2 {
    public static void main(String[] args) {

        Iphone obj = new Iphone();
        Samsung obj1 = new Samsung();
        show(obj);
        show(obj1);
    }

    public static void show(Phone obj) {
        obj.showConfig();
    }
}

abstract class Phone {
    public abstract void showConfig();

}

class Iphone extends Phone {
    public void showConfig() {
        System.out.println("2 Gb, IOS 13");
    }
}

class Samsung extends Phone {
    public void showConfig() {
        System.out.println("4 Gb, Android 10.0");
    }
}
