package com.maveric.code.modernjavapragmaticcodingschool.steams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        Map<String, List<String>> stringListMap= StudentDataBase.getAllStudents().stream()
                .peek((student -> System.out.println(student)))
                .filter((student -> student.getGradeLevel()>3))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(stringListMap);
    }
}
