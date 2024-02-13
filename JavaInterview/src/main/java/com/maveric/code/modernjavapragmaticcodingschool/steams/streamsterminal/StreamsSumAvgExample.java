package com.maveric.code.modernjavapragmaticcodingschool.steams.streamsterminal;

import com.maveric.code.modernjavapragmaticcodingschool.steams.Student;
import com.maveric.code.modernjavapragmaticcodingschool.steams.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {
    public static  int sum(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNotebooks));
    }
    public static  double avg(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNotebooks));
    }
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(avg());
    }
}
