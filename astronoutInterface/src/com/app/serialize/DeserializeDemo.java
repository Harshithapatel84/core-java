package com.app.serialize;

import java.io.ObjectInputStream;

    import java.io.FileInputStream;

    public class DeserializeDemo {
        public static void main(String[] args) {
            try {
                FileInputStream file = new FileInputStream("student.txt");
                ObjectInputStream in = new ObjectInputStream(file);

                Student s2 = (Student) in.readObject();

                in.close();
                file.close();

                System.out.println(s2.id + " " + s2.name);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

