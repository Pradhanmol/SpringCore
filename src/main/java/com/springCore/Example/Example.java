package com.springCore.Example;

public class Example {
    private String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public Example() {
        System.out.println("Setting the value of property ");
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }
    public void hey(){
        System.out.println("This function is intializing the bean");
    }
    public void bye(){
        System.out.println("This function is destroying the bean after setting the value");
    }
}
