package com.springCore.auto.wire.annotation;

import com.springCore.auto.wire.Employee;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Annotation.xml");
        Employee2 emp3 = (Employee2) context.getBean("mpl");
        System.out.println(emp3);
    }
}
