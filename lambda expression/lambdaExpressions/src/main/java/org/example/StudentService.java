package org.example;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentService {
    ArrayList<Student> students = new ArrayList<>();
    public StudentService(){
        students.add(new Student("Kirti Patel", 12, 6, 3000));
        students.add(new Student("Riya Saha", 23, 5, 2000));
        students.add(new Student("Prakash Mehta", 11, 6, 3000));
        students.add(new Student("Suhana Sidd", 24, 5, 2000));
        students.add(new Student("Pratik Pandey", 13, 6, 3000));
        students.add(new Student("Raina Khan", 15, 7, 4000));
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
            //implemented anonymous class or functional interface
             FeesIncrement feesIncrement = (val1, val2) ->  val1 + val2;
                    long feeIncremented = feesIncrement.test(student1.getFees(), 1000);
                    student1.setFees(feeIncremented);
                   studentList.add((student1));
               }
        return studentList;
    }
    public ArrayList<Student> filterStudents(String str){
        ArrayList<Student> filteredList = new ArrayList<>();
        for(Student student: students){
            //implemented predicate (one kind of funtional interface)
            Predicate<Student> predicate = (st) -> {return st.getStudentName().startsWith(str);};
            if(predicate.test(student)){
                filteredList.add(student);
            }
        }
        return filteredList;
    }
}
