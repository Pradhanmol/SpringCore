package com.springCore.SpringExpLang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringExp.Xml");
        Demo demo = context.getBean("demo",Demo.class);
        System.out.println(demo);
    }
}
