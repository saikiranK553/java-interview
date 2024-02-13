package com.maveric.code.modernjavapragmaticcodingschool.steams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {
    public static Optional<Integer> limit(List<Integer> list){
        return list
                .stream()
                .limit(2)
                .reduce((a,b)->a+b);
    }
    public static Optional<Integer> skip(List<Integer> list){
        return list
                .stream()
                .skip(4)
                .reduce((a,b)->a+b);
    }
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,3,7,6,5,4);
        System.out.println(limit(list).isPresent()?limit(list).get():"no value");
        System.out.println(skip(list).isPresent()?skip(list).get():"no value");
    }
}
