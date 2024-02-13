package com.maveric.code.designpatterns.singletonpattern;

public class LazyInitializationHolder {
    private LazyInitializationHolder(){
    }
    private static class InitializationHolder{
        private static LazyInitializationHolder INSTANCE=new LazyInitializationHolder();
    }
    public static LazyInitializationHolder getInstance(){
        return InitializationHolder.INSTANCE;
    }
}
