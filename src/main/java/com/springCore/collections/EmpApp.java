package com.springCore.collections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {
   public static void main(String[] args) {
      AbstractApplicationContext context =  new  ClassPathXmlApplicationContext("Collections.xml");
      Emp emp1 = (Emp) context.getBean("emp1");
      System.out.println(emp1.getName());
      System.out.println(emp1.getPhoneNumbers());
      System.out.println(emp1.getAddresses());
      System.out.println(emp1.getCourses());
   }
}
