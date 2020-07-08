package com.pluhi;

class Multithreading extends Thread {
    public void run() {

        try {
            Thread.sleep(1000);
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }

    }
}

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            MultithreadingDemo object = new MultithreadingDemo();
            object.start();

        }
    }
}

