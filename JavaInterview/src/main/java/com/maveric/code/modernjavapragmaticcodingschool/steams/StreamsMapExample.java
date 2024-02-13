package com.maveric.code.modernjavapragmaticcodingschool.steams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapExample {
    public static List<String> namesList(){
        List<String> studentList=StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        return studentList;
    }
    public static void main(String[] args) {
        System.out.println(namesList());
    }
}
