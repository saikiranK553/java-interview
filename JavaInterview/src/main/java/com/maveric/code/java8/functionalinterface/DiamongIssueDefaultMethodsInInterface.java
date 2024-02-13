package com.maveric.code.java8.functionalinterface;

public class DiamongIssueDefaultMethodsInInterface implements Right,Left{
//    @Override
//    public void walk(){
//        System.out.println("walking straight");
//    }
    @Override
    public void walk(){
        Left.super.walk();
    }
    public static void main(String[] args) {
        DiamongIssueDefaultMethodsInInterface anInterface=new DiamongIssueDefaultMethodsInInterface();
        anInterface.walk();
    }
}
