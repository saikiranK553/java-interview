package com.maveric.code.modernjavapragmaticcodingschool.steams.streamsterminal;

import com.maveric.code.modernjavapragmaticcodingschool.steams.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsCountingExample {
    public static long count(){
         return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.counting());
    }
    public static void main(String[] args) {
        System.out.println(count());
    }
}
