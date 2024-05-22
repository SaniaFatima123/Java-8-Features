package org.example;

import java.util.ArrayList;

public class StudentService {
    ArrayList<Student> students = new ArrayList<>();
    public StudentService(){
        students.add(new Student("Riya Saha", 23, 5, 2000));
        students.add(new Student("Suhana Sidd", 24, 5, 2000));
        students.add(new Student("Prakash Mehta", 11, 6, 3000));
        students.add(new Student("Kirti Patel", 12, 6, 3000));
    }
    public ArrayList<Student> allStudents(){
        ArrayList<Student> allStudents = new ArrayList<>();
        for(Student student: students){
            allStudents.add(student);
        }
        return allStudents;
    }
    public ArrayList<Student> feesIncrement(){
        ArrayList<Student> studentList = new ArrayList<>();
        for(Student student1: students){
             FeesIncrement feesIncrement = (a, b) ->  a + b;
                    long feeIncremented = feesIncrement.test(student1.getFees(), 1000);
                    student1.setFees(feeIncremented);
                   studentList.add((student1));
               }
        return studentList;
    }
}
