package com.springCore.JavaConfig;

import com.springCore.Example.Samosa;

public class Student {
    private Samosa2 samosa2;

    public Samosa2 getSamosa2() {
        return samosa2;
    }

    public void setSamosa2(Samosa2 samosa2) {
        this.samosa2 = samosa2;
    }

    public Student(Samosa2 samosa2) {
        this.samosa2 = samosa2;
    }

    public void study(){
        this.samosa2.display();
        System.out.println("Student is reading a book");
    }
}
