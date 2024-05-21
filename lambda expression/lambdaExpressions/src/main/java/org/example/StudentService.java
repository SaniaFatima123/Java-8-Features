package org.example;

import java.util.ArrayList;

public class StudentService {
    ArrayList<Student> students = new ArrayList<>();
    public StudentService(){
        students.add(new Student("Riya Saha", 23, 5));
        students.add(new Student("Suhana Sidd", 24, 5));
        students.add(new Student("Prakash Mehta", 11, 6));
        students.add(new Student("Kirti Patel", 12, 6));
    }
    public ArrayList<Student> allStudents(){
        ArrayList<Student> allStudents = new ArrayList<>();
        for(Student student: students){
            allStudents.add(student);
        }
        return allStudents;
    }
}
