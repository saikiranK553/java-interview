package com.maveric.code.java8.functionalinterface;

public interface Right {
    default void walk(){
        System.out.println("walk right");
    }
}
