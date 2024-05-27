package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Thread1 t1 = new Thread1("t1");
//        Thread1 t2 = new Thread1("t2");
//        Thread1 t3 = new Thread1("t3");
//        t1.setDaemon(true);
//        t1.start();
//        t2.start();
//        t3.setDaemon(true);
//        t3.start();
        Thread1 t1 = new Thread1("t1");
        t1.setDaemon(true);
        t1.start();
        Thread2 t2 = new Thread2("t2");
        t2.start();
    }
}