package com.statement;

import java.util.Scanner;

public class Input2Demo {
    static String name;
    static int age;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = scan.nextInt();
        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Name: "+name+" Age: "+age);
        scan.close();
    }
}
