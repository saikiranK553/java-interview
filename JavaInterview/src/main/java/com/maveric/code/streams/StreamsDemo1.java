package com.maveric.code.streams;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(23,5,6,4,3,78);
        List<Integer> even=new ArrayList<>();
        List<Integer> mulByTwo=new ArrayList<>();
        for(Integer item:list){
            if(item%2==0){
                even.add(item);
            }
        }
        List<Integer> evenNumbers= list.stream().filter(a->a%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);
        System.out.println("in for "+even);
        List<Integer> mapToMul= list.stream().map(a->a*2).collect(Collectors.toList());
        System.out.println(mapToMul);
        Long count=list.stream().filter(a->a%2==0).count();
        System.out.println("count of even is "+count);
        //sorted
        List<Integer> sortedList=list.stream().sorted().collect(Collectors.toList());
        System.out.println("after sorted naturally "+sortedList);
        List<Integer> reverseOrder= list.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println(reverseOrder);
        Integer minValue= list.stream().min((a,b)->a.compareTo(b)).get();
        System.out.println(minValue);

        //toArray
        //Integer arr[]= list.stream().toArray(Integer[]::new);
        Integer arr[]=list.stream().toArray(a->new Integer[a]);
        System.out.println("array is "+Arrays.toString(arr));
    }
}
