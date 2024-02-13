package com.maveric.code.designpatterns.singletonpattern;

public class LazySingleton {
    private LazySingleton(){
    }
    //volatile forces value read/write from main memory instead of cache
    private static volatile LazySingleton INSTANCE;
    //double check locking using synchronization
    public static  LazySingleton getInstance(){
        if(INSTANCE==null){
            synchronized (LazySingleton.class){
                if(INSTANCE==null){
                    INSTANCE=new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
