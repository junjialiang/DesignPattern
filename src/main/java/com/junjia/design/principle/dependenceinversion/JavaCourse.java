package com.junjia.design.principle.dependenceinversion;

/**
 * Created by junjia
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("junjia在学习Java课程");
    }
}
