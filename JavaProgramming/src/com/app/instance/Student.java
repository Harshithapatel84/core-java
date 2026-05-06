package com.app.instance;

public class Student {
    int marks=90;

    public static void main(String[] args) throws Exception
    {
        Class<?> c = Class.forName("com.app.instance.Student");
        Student s2 = (Student) c.getDeclaredConstructor().newInstance();

        System.out.println(s2.marks);

    }
}
