package com.springCore.auto.wire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WithoutAnnotationTest {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("WithOutAn.xml");
        Employee emp = (Employee) context.getBean("mpl");
        System.out.println(emp);
    }
}

