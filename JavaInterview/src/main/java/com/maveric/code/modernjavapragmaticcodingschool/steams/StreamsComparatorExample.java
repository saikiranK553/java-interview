package com.maveric.code.modernjavapragmaticcodingschool.steams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {
    public static List<Student> sortStudentsByName(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }
    public static List<Student> sortStudentsByGpa(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }
    public static List<Student> sortStudentsByGpaReversed(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(sortStudentsByName());
        System.out.println(sortStudentsByGpa());
        System.out.println(sortStudentsByGpaReversed());
    }
}
