package com.springCore.Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Example.xml");
        Example ex1 = (Example) context.getBean("example");
        System.out.println(ex1);
        Samosa samos = (Samosa) context.getBean("s1");
        Pepsi coldDrink = (Pepsi) context.getBean("pepsi");
        System.out.println(samos);
        System.out.println(coldDrink);
    }
}
