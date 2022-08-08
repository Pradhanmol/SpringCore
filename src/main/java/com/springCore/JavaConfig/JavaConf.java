package com.springCore.JavaConfig;

import com.springCore.Example.Samosa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//configuartion we used instead of xml file we create prev for define the beans for object creation
public class JavaConf {
    @Bean
    @Scope("prototype")
    public Student getStudent(){
        //creating a new object of student
        Student student = new Student(getSamosa());
        return student;
    }
    @Bean
    public Samosa2 getSamosa(){
        return new Samosa2();
    }
}
