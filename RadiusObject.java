package com.zetcode;


class Circle {
    private int radius;

    public Circle(int radius) {

        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area() {

        return this.radius * this.radius * Math.PI;

    }
}

public class RadiusObject {

    public static void main(String[] args) {
        var c = new Circle(5);
        System.out.println(c.area());
        c.setRadius(10);
        System.out.println(c.area());
    }
}
