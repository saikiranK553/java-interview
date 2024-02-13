package com.maveric.code.designpatterns.singletonpattern;

public class Client {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton=EagerSingleton.getInstance();
        EagerSingleton eagerSingleton1=EagerSingleton.getInstance();
        System.out.println(eagerSingleton==eagerSingleton1);

        LazySingleton lazySingleton=LazySingleton.getInstance();
        LazySingleton lazySingleton1=LazySingleton.getInstance();
        System.out.println(lazySingleton==lazySingleton1);

        LazyInitializationHolder lazyInitializationHolder=LazyInitializationHolder.getInstance();
        LazyInitializationHolder lazyInitializationHolder1=LazyInitializationHolder.getInstance();
        System.out.println(lazyInitializationHolder==lazyInitializationHolder1);
    }
}
