package com.springCore.JavaConfig;

import com.springCore.Example.Samosa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConf.class);
        //Here the object is prototype means every time object get new hash code i.e  done
        // by using Scope annnotation in config class at the time of when bean creates object or declare above the bean
        Student student = context.getBean("getStudent",Student.class);
        Student student1 = context.getBean("getStudent",Student.class);
        Student student2 = context.getBean("getStudent",Student.class);
        Student student3 = context.getBean("getStudent",Student.class);
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        student.study();
    }
}
