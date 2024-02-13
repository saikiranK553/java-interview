package com.maveric.code.java8.functionalinterface;

public class ClassCallingDefaultDirectly implements DefaultMethodInterface{
    public static void main(String[] args) {
        ClassCallingDefaultDirectly directly=new ClassCallingDefaultDirectly();
        directly.getName();
    }
}
