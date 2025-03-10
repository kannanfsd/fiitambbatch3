package com.statement;

import java.util.Scanner;

class Employee{
    int empId;
    String empName;
    String designation;
    double salary;
    float age;
    char gender;
    boolean isPermanent;
    public void getEmployeeInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        empId = Integer.parseInt(scan.nextLine());
        System.out.println("Enter Employee Name: ");
        empName = scan.nextLine();
        System.out.println("Enter Employee Designation: ");
        designation = scan.nextLine();
        System.out.println("Enter Employee Salary: ");
        salary = Double.parseDouble(scan.nextLine());
        System.out.println("Enter Employee Age: ");
        age = Float.parseFloat(scan.nextLine());
        System.out.println("Enter Employee Gender: ");
        gender = scan.next().charAt(0);
        System.out.println("Enter Employee Permanent Status: ");
        isPermanent = Boolean.parseBoolean(scan.next());
        scan.close();
    }
    public void printEmployeeDetails() {
        System.out.println("Employee ID: "+empId);
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Designation: "+designation);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee Age: "+age);
        System.out.println("Employee Gender: "+gender);
        System.out.println("Employee Permanent Status: "+isPermanent);
    }
}


public class Input3Demo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getEmployeeInput();
        employee.printEmployeeDetails();
    }
}
