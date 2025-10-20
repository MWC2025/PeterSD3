package com.example.Lab1;

public class Lab1 {
    public static void main(String[] args){

        Student s1 = new Student("Lisa", "Haskel", 1);
        Student s2 = new Student("Touseef", "Tahir", 2);

        System.out.println(s1.getStudentInfo());
        System.out.println(s2.getStudentInfo());
    }
}
