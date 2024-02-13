package com.maveric.code.modernjavapragmaticcodingschool.steams.streamsterminal;

import com.maveric.code.modernjavapragmaticcodingschool.steams.Student;
import com.maveric.code.modernjavapragmaticcodingschool.steams.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ChatGptModerateQuestions {
    public static void main(String[] args) {
        List<String> list= StudentDataBase.getAllStudents()
                .stream()
                .filter(student->student.getGradeLevel()==12 && student.getGpa()>4)
                .collect(Collectors.mapping(Student::getName,Collectors.toList()));
        System.out.println(list);

        List<Student> students= StudentDataBase.getAllStudents()
                .stream()
        //        .sorted(Comparator.comparing(Student::getGpa).reversed())
                .sorted((a,b)->Double.compare(b.getGpa(),a.getGpa()))
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(students);

          Map<String,Long> aLong= StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
        System.out.println(aLong);

        Optional<Student> student= StudentDataBase.getAllStudents()
                .stream()
                .reduce((a,b)->a.getGpa()>b.getGpa()?a:b);
        System.out.println(student.get());

        Optional<Student> student1=    StudentDataBase.getAllStudents()
                .stream()
                .filter(a->a.getActivities().contains("basketball"))
                .findFirst();
        System.out.println(student1);

        Map<Boolean,List<Student>> map= StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(s->s.getActivities().contains("football")));
        map.forEach((key, value) -> {
            System.out.println("Activities contains 'football': " + key);
            System.out.println("Students: ");
            value.forEach(System.out::println);
            System.out.println("------------------------");
        });
    }
}
