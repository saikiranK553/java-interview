package com.maveric.code.general;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreationUsing3NewInstanceConstructor {
    public static void main(String[] args) {
        Constructor<Student> constructor;
        try {
            constructor=Student.class.getConstructor();
            Student student=constructor.newInstance();
            System.out.println(student);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
