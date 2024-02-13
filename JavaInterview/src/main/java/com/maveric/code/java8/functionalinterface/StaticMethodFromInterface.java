package com.maveric.code.java8.functionalinterface;

public class StaticMethodFromInterface implements IStaticMethod{
    public static void main(String[] args) {
        StaticMethodFromInterface anInterface=new StaticMethodFromInterface();
        //won't work below
//        anInterface.check();
//        StaticMethodFromInterface.check();
        IStaticMethod.check();

    }
}
