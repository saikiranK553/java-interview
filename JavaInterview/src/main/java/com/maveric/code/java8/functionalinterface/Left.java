package com.maveric.code.java8.functionalinterface;

public interface Left {
    default void walk(){
        System.out.println("walk left");
    }
}
