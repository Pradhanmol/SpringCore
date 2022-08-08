package com.springCore.StandAlone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Alone.xml");
        Person person  = (Person) context.getBean("person2", Person.class);
        System.out.println(person);
        System.out.println(person.getFriends().getClass());
        System.out.println(person.getFeesStructure());
        System.out.println(person.getFeesStructure().getClass());
        System.out.println(person.getProperties());
        System.out.println(person.getProperties().getClass());
    }
}
