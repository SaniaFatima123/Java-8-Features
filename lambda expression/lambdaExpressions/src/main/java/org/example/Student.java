package org.example;

public class Student {
    private String studentName;
    private int roll;

    private int standard;

    public Student() {
    }
    public Student(String studentName, int roll, int standard){
        this.studentName = studentName;
        this.roll = roll;
        this.standard = standard;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", roll=" + roll +
                ", class=" + standard +
                '}';
    }
}
