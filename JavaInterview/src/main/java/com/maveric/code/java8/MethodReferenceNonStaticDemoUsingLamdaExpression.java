package com.maveric.code.java8;

public class MethodReferenceNonStaticDemoUsingLamdaExpression {
    public static void main(String[] args) {
        Runnable runnable=()->{
            System.out.println("in child thread "+Thread.currentThread().getName());
        };
        Thread thread=new Thread(runnable);
        System.out.println("in main and thread is "+Thread.currentThread().getName());
        thread.start();
    }
}
