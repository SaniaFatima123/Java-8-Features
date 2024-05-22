package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StudentService studentService = new StudentService();
        ArrayList<Student> all = studentService.allStudents();
        for(Student student: all){
            System.out.println(student);
        }

        ArrayList<Student> allStudents = studentService.feesIncrement();
        System.out.println("All Students after incrementing fees");
        for(Student student: allStudents){
            System.out.println("Student name "+student.getStudentName()+" Student roll number "+student.getRoll()+" " +
                    " Student class "+student.getStandard()+" Student new fees "+student.getFees());
        }
        String str = "P";
        ArrayList<Student> filteredStudents = studentService.filterStudents(str);
        System.out.println("All Student after filteration");
        for(Student student: filteredStudents){
            System.out.println("Student name "+student.getStudentName()+" Student roll number "+student.getRoll()+" " +
                    " Student class "+student.getStandard()+" Student new fees "+student.getFees());
        }
    }
}