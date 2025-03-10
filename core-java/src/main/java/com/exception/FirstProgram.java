package com.exception;

import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Begin the program...");
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        try {
            int c = a / b;
            System.out.println("Division Result:  "+c);
        }catch (ArithmeticException e) {
            System.err.println("It is not possible to divide by zero.");
        }
        System.out.println("Continue the program...");
        System.out.println("End the program...");
    }
}
