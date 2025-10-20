package com.example.Lab1;

public class Student {
    String firstname;
    String lastname;
    int courseId;

    public Student(String firstname, String lastname, int courseId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.courseId = courseId;
    }

    public String getStudentInfo() {
        String hello = "Student %s is in course %s";
        String name = firstname + lastname.charAt(0);
        return String.format(hello , name, this.courseId);
    }
}

