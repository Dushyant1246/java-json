package com.bridgelabz.jsonSpecific;

public class Student {
    String name, email, grade;
    int age, rollNo, marks;

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getGrade() {
        return grade;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public Student(int age, String email, String grade, int marks, String name, int rollNo) {
        this.age = age;
        this.email = email;
        this.grade = grade;
        this.marks = marks;
        this.name = name;
        this.rollNo = rollNo;
    }
}
