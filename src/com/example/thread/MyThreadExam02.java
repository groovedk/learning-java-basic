package com.example.thread;

public class MyThreadExam02 {

    public static void main(String[] args) {

        String name = Thread.currentThread().getName();
        System.out.println("thread name:" + name);
        System.out.println("thread start");

        MyRunnable mr1 = new MyRunnable("*");
        MyRunnable mr2 = new MyRunnable("+");

        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);

        t1.start();
        t2.start();

        System.out.println("thread end");
    }

}
