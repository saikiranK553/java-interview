package com.maveric.code.modernjavapragmaticcodingschool.steams.streamsterminal;

import com.maveric.code.modernjavapragmaticcodingschool.steams.Student;
import com.maveric.code.modernjavapragmaticcodingschool.steams.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamGroupingByExample {
    public static void groupStudentsByGender() {
        Map<String, List<Student>> list = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println(list);
    }

    public static void customizedGroupStudentsByGender() {
        Map<String, List<Student>> list = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "ASSRITHA_STANDING"));
        System.out.println(list);
    }

    public static void twoLevelGrouping_1() {
        Map<Integer, Map<String, List<Student>>> list = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "ASSRITHA_STANDING")));
        System.out.println(list);
    }

    public static void twoLevelGrouping_2() {
        Map<Integer, Integer> list = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.summingInt(Student::getNotebooks)));
        System.out.println(list);
    }

    //    public static void twoLevelGrouping_3(){
//        Map<Integer, Optional<Student>> list= StudentDataBase.getAllStudents()
//                .stream()
//                        .collect(Collectors.groupingBy(Student::getGradeLevel,
//                                Collectors.maxBy(Comparator.comparing(Student::getGpa))));
//        System.out.println(list);
//    }
    public static void twoLevelGrouping_3() {
        Map<Integer, Student> list = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),
                                Optional::get)));
        System.out.println(list);
    }

    public static void main(String[] args) {

        groupStudentsByGender();
        customizedGroupStudentsByGender();
        twoLevelGrouping_1();
        twoLevelGrouping_2();
        twoLevelGrouping_3();
    }
}
