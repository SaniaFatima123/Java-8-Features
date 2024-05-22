package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.*;

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

        // Different kinds of funtional interface *****************

        Predicate<Integer> predicate=(val)->val%2==0;
        System.out.println(predicate.test(9));

        BiPredicate<Integer,Integer> predicate2=(val1, val2)->val1%val2==0;
        System.out.println(predicate2.test(10,2));

        Consumer<Integer> consumer = (val) -> System.out.println(val);
        consumer.accept(8);

        BiConsumer<Integer, Integer> biConsumer = (val1, val2) -> System.out.println(val1+val2);
        biConsumer.accept(10,10);

        Supplier<String> supplier = () ->  "I'm a supplier, I only return data";
        System.out.println(supplier.get());

        Function<Integer,String> function = (val) -> "Data in function is "+ val;
        System.out.println(function.apply(1));
    }
}