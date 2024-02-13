package com.maveric.code.java8.functionalinterface;

public interface DefaultMethodInterface {
    default void getName(){
        System.out.println("in DefaultMethodInterface");
    }
}
