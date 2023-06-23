package com.example.thread;

public class MyRunnable implements Runnable {

    private String str;

    public MyRunnable(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("mt name = " + name);

        for (int i = 0; i < 10; i++) {
            System.out.print(str);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
