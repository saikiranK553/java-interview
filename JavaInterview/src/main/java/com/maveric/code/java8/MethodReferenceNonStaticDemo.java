package com.maveric.code.java8;

public class MethodReferenceNonStaticDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("running"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MethodReferenceNonStaticDemo nonStaticDemo=new MethodReferenceNonStaticDemo();
        Thread thread=new Thread(nonStaticDemo);
        System.out.println("in main");
        System.out.println("thread name "+Thread.currentThread().getName());
        thread.start();
    }
}
