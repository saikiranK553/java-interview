package com.maveric.code.modernjavapragmaticcodingschool.steams.streamsterminal;

import com.maveric.code.modernjavapragmaticcodingschool.steams.Student;
import com.maveric.code.modernjavapragmaticcodingschool.steams.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMappingExample {
    public static void main(String[] args) {
       List<String> list=StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toList()));
        System.out.println(list);
    }
}
