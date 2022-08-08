package com.springCore.stereoTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("StereoConfig.xml");
        Student student = context.getBean("student",Student.class);
        Teacher teacher1 = (Teacher) context.getBean("teacher");
        Teacher teacher2 = (Teacher) context.getBean("teacher");
        System.out.println(student);
        System.out.println(teacher1.getClass().hashCode());
        System.out.println(teacher2.getClass().hashCode());

    }
}
