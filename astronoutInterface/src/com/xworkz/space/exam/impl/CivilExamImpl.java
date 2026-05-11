package com.xworkz.space.exam.impl;

import com.xworkz.space.exam.CivilExam;

public class CivilExamImpl implements CivilExam {
    public void apply() {
        System.out.println("Applying for civil services exam");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing with dedication and study plan");
    }

    @Override
    public void writeExam() {
        System.out.println("Writing the civil services examination");
    }


}
