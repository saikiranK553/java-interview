package com.maveric.code.designpatterns.singletonpattern;

public class EagerSingleton {
    //crete private constructor so that no one can create object
    private EagerSingleton(){
    }
    private static final EagerSingleton INSTANCE=new EagerSingleton();
    public static EagerSingleton getInstance(){
        return INSTANCE;
    }
}
