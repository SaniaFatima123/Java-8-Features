package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StudentService studentService = new StudentService();
        ArrayList<Student> all = studentService.allStudents();
        for(Student student: all){
            System.out.println(student);
        }
    }
}