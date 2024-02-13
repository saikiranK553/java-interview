package com.maveric.code.java8;

public class MethodReferenceDemo1 {
    public static  void m2(){
        System.out.println("in methodReferenceDemo1 m2 method");
    }
    public static void main(String[] args) {
        IMethodReference reference=MethodReferenceDemo1::m2;
        //m1() internally refers to m2()
        reference.m1();
    }
}
