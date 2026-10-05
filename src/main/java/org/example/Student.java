package org.example;

public class Student {
    String name;
    int studentId;
    String email;

    Student(String name, int studentId, String email) {
        this.name = name;
        this.studentId = studentId;
        this.email = email;
    }

    public static void main(String[] args) {
        Student s = new Student("Rida", 101, "rida@email.com");
        System.out.println("Student details:");
        System.out.println("Name: " + s.name);
        System.out.println("ID: " + s.studentId);
        System.out.println("Email: " + s.email);
    }
}
