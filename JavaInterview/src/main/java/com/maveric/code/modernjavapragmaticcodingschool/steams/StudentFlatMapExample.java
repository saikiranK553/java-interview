package com.maveric.code.modernjavapragmaticcodingschool.steams;

import java.util.List;
import java.util.stream.Collectors;

public class StudentFlatMapExample {
    public static List<String> printStudentActivities(){
        List<String> activityList= StudentDataBase.getAllStudents()
                .stream()
//                .map(Student::getActivities)
//                .flatMap(List::stream)
                .flatMap((student -> student.getActivities().stream()))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return activityList;
    }

    public static Long printStudentActivitiesCount(){
        Long activityCount= StudentDataBase.getAllStudents()
                .stream()

                .flatMap((student -> student.getActivities().stream()))
                .distinct()
                .count();
        return activityCount;
    }
    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(printStudentActivitiesCount());
    }
}
