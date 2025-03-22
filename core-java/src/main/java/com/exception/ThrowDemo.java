package com.exception;

class Validate {
    public static void validate(int age) {
        if(age>=18) {
            System.out.println("You are eligible to vote.");
        } else {
            throw new ArithmeticException("You are not eligible to vote.");
        }
    }
}
public class ThrowDemo {
    public static void main(String[] args) {
        Validate.validate(27);
    }
}
