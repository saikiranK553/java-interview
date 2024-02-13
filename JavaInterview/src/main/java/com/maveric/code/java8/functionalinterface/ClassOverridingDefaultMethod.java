package com.maveric.code.java8.functionalinterface;

public class ClassOverridingDefaultMethod implements DefaultMethodInterface{
    @Override
    public void getName(){
        System.out.println("in ClassOverridingDefaultMethod");
    }

    public static void main(String[] args) {
        ClassOverridingDefaultMethod method=new ClassOverridingDefaultMethod();
        method.getName();
    }
}
