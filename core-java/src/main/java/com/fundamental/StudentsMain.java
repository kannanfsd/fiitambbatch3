package com.fundamental;

public class StudentsMain {
    public static void main(String[] args) {
        Students students = new Students();
        System.out.println("Before set the value...");
        System.out.println("Student ID: "+students.getStudId());
        System.out.println("Student Name: "+students.getStudName());
        System.out.println("Phone Number: "+students.getStudPhoneNo());
        System.out.println("Email ID: "+students.getStudEmailId());

        students.setStudId(1001);
        students.setStudName("John Doe");
        students.setStudPhoneNo(9876543210L);
        students.setStudEmailId("9iIYV@example.com");

        System.out.println("After set the value...");
        System.out.println("Student ID: "+students.getStudId());
        System.out.println("Student Name: "+students.getStudName());
        System.out.println("Phone Number: "+students.getStudPhoneNo());
        System.out.println("Email ID: "+students.getStudEmailId());
    }
}
