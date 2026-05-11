package com.xworkz.space.exam;

public interface CivilExam {
    String examName = "UPSC Civil Services";
    int attempts = 6;

    void apply();
    void prepare();
    void writeExam();

    default void  write(){
        System.out.println("write the exam");
    }
     default void read()
    {
        System.out.println("read for exam");
    }
    static void examInfo()
    {
        System.out.println("executing the exam type with information");
    }

}
