package com.subhash;

public class Main {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();//thread will start only if start method is called.
        t2.start();

    }
}

class MyThread1 extends Thread {

    public void run(){
        System.out.println("Thread1 is running");
    }
}

class MyThread2 extends Thread {

    public void run(){
        System.out.println("Thread2 is running");
    }
}