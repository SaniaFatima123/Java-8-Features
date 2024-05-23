package org.example;


import java.util.ArrayList;
import java.util.Collections;

class Employee {
    private String name;
    private int age;

    public Employee(){}
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Compare  {

    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Shrey", 24));
        employees.add(new Employee("Suhana", 23));
        employees.add(new Employee("Priti", 21));
        employees.add(new Employee("Naina", 20));
        employees.add(new Employee("Ananya", 25));

        // using static method reference to sort arraylist by name **********
        Collections.sort(employees, Compare::compareByName);

        // printing all the name using stream after name comparision
        employees.stream().map(x -> x.getName()).forEach(System.out::println);

//        // using static method reference to sort arraylist by age **********
//        Collections.sort(employees, Compare::compareByAge);
//
//        // printing all the name using stream after age comparision
//        employees.stream().map(x -> x.getAge()).forEach(System.out::println);

        // calling non-static method using method reference
        Compare obj = new Compare();
        Thread td = new Thread(obj::startingString);
        td.start();
     }


     // static method
     public static int compareByName(Employee a, Employee b){
        return a.getName().compareTo(b.getName());
     }
//     public static int compareByAge(Employee a, Employee b){
//        return a.getAge().compareTo(b.getAge());
//     }

    // non static method
    public void startingString() {
        System.out.println("non static method called");
    }

}
