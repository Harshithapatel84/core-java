package com.app.serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "Harshitha");

            FileOutputStream file = new FileOutputStream("student.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(s1);

            out.close();
            file.close();

            System.out.println("Serialized successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


