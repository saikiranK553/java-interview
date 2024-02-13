package com.maveric.code.modernjavapragmaticcodingschool.steams;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class StreamsReduceExample {
    public static int performMultiplication(List<Integer> list){
        return list.stream()
                .reduce(1,(a,b)->a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> list){
        return list.stream()
                .reduce((a,b)->a*b);
    }

    public static Optional<Student> getHighestGpaStudent(){
        return StudentDataBase.getAllStudents().stream()
//                .reduce((a,b)->{
//                    if(a.getGpa()>b.getGpa()){
//                        return a;
//                    }else{
//                        return b;
//                    }
//                });
                .reduce((a,b)->a.getGpa()>b.getGpa()?a:b);
    }
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,5,7,9,5);
        System.out.println(performMultiplication(list));
        Optional<Integer> optionalInteger=performMultiplicationWithoutIdentity(list);
        if(optionalInteger.isPresent()){
            System.out.println(optionalInteger.get());
        }
        Optional<Student> student=getHighestGpaStudent();
        student=Optional.empty();
        System.out.println(student.isPresent()?student.get():"no student with highest grade");

    }
}
