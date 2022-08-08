package com.springCore;

import com.springCore.Example.Example;
import com.springCore.Example.Pepsi;
import com.springCore.Example.Samosa;
import com.springCore.auto.wire.Employee;
import com.springCore.auto.wire.annotation.Employee2;
import com.springCore.ci.Person;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springCore.collections.Emp;
import com.springCore.auto.wire.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
        context.registerShutdownHook();
        Student student1 = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");
        Student student3 = (Student) context.getBean("student3");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
