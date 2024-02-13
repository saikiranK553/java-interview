package com.maveric.code.modernjavapragmaticcodingschool.steams.streamsterminal;

import com.maveric.code.modernjavapragmaticcodingschool.steams.Student;
import com.maveric.code.modernjavapragmaticcodingschool.steams.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ChatGptQuestions {
    public static void main(String[] args) {
        String list= StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
        System.out.println(list);

        long count= StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.counting());

        System.out.println(count);

        List<String> namesList= StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toList()));
        System.out.println(namesList);

        Optional<Student> student= StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
            System.out.println(student.get());
        Student student1=    StudentDataBase.getAllStudents()
                    .stream()
                    .collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),Optional::get));
        System.out.println(student1);

        long countOfNotebooks= StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNotebooks));
        System.out.println(countOfNotebooks);

         Map<Double,List<Student>> map= StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGpa));
        System.out.println(map);

        Map<Boolean,List<Student>> booleanListMap= StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(student2->student2.getGpa()>=4.0));
        System.out.println(booleanListMap);
    }
}
