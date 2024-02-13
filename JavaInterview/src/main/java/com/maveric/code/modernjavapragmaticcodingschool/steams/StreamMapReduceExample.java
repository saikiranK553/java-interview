package com.maveric.code.modernjavapragmaticcodingschool.steams;

import java.util.Optional;

public class StreamMapReduceExample {
    //    public static int totalBooks(){
//        return StudentDataBase.getAllStudents().stream()
//                .map(Student::getNotebooks)
//                .reduce(0,(a,b)->a+b);
//    }
    public static Optional<Integer> totalBooks() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNotebooks)
                .reduce((a, b) -> a + b);
    }

    public static void main(String[] args) {
        System.out.println(totalBooks().isPresent()?totalBooks().get():"no books");
    }
}
