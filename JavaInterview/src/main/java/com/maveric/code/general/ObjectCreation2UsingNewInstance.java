package com.maveric.code.general;

public class ObjectCreation2UsingNewInstance {
    public static void main(String[] args) {
        String className="com.maveric.code.general.Student";
        try {
            Class aClass= Class.forName(className);
            Student student= (Student) aClass.newInstance();
            System.out.println(student);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            // Handle any of the specified exceptions
            throw new RuntimeException(e);
        }
    }
}
