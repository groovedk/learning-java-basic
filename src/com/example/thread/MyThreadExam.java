package com.example.thread;

public class MyThreadExam {

    public static void main(String[] args) {

        String name = Thread.currentThread().getName();
        System.out.println("thread name:" + name);
        System.out.println("thread start");

//        for (int i = 0; i < 10; i++) {
//            System.out.print("*");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                ex.printStackTrace();
//            }
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print("+");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                ex.printStackTrace();
//            }
//        }

        MyThread mt1 = new MyThread("*");
        MyThread mt2 = new MyThread("+");

        mt1.start();
        mt2.start();

        System.out.println("thread end");
    }

}
