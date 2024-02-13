package com.maveric.code.java8;

public class MethodReferenceNonStaticDemo1 {
    public void m1(){
        for(int i=0;i<10;i++){
            System.out.println("in Thread "+Thread.currentThread().getName()+" "+i);
        }
    }
    public static void main(String[] args) {
        MethodReferenceNonStaticDemo1 demo1=new MethodReferenceNonStaticDemo1();
        Runnable runnable=demo1::m1;
        Thread t=new Thread(runnable);
        t.start();
        demo1.m1();

    }
}
