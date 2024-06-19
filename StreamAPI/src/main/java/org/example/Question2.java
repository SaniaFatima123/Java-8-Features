package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Question2 {
    class Student{
        private int studentId;
        private String studentName;

        private String gender;

        public Student() {
        }
        public Student(int studentId, String studentName, String gender){
            this.studentId = studentId;
            this.studentName = studentName;
            this.gender = gender;
        }

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }


   public static void main(String[] args){

//       ArrayList<String> names = new ArrayList<>();
//       names.add("Sania");
//       names.add("Rahul");
//       names.add("Sara");
//       names.add("Sara");
//       names.add("Laila");
//       names.add("Soha");
//
//       List<String> newNames = names.stream().filter(name->name.startsWith("Sa")).collect(Collectors.toList());
//       System.out.println(newNames);

       Question2 obj= new Question2();
       System.out.println(obj.getNames());
   }
   public List<String> getNames(){
       ArrayList<Student> arr = new ArrayList<>();
       arr.add(new Student(1, "Sanjana","Female"));
       arr.add(new Student(1, "Ramya","Female"));
       arr.add(new Student(1, "Pratik","Male"));
       arr.add(new Student(1, "Nikhil","Male"));
       arr.add(new Student(1, "Soumya","Female"));
       arr.add(new Student(1, "Rohit","Male"));
       arr.add(new Student(1, "Rajani","Female"));
       arr.add(new Student(1, "Sohail","Male"));

      List<String> names = arr.stream().filter(student->student.getStudentName().startsWith("R")).map(student->student.getStudentName()).collect(Collectors.toList());

      return(names);

   }

}
