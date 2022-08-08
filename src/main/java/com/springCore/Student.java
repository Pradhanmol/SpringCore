package com.springCore;

public class Student {
    private int studentId;
    private String  studentName;
    private String studentAddress;

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }
    public void setStudentId(int studentId) {
        System.out.println("Setting StudentId");
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        System.out.println("Setting StudentName");
        this.studentName = studentName;
    }

    public void setStudentAddress(String studentAddress) {
        System.out.println("Setting StudentAddress");
        this.studentAddress = studentAddress;
    }

    public Student() {
    }

    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
