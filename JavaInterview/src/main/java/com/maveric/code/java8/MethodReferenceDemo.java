package com.maveric.code.java8;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        IMethodReference reference=()->{
            System.out.println("in main using lambda");
        };
        reference.m1();
    }
}
