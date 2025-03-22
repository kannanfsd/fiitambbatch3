package com.exception;

import java.util.Scanner;

class Demo {
    public void division(int dividend, int divisor) throws ArithmeticException {
        if(divisor == 0) throw new ArithmeticException("FIIT: Error in division.");
        int result = dividend / divisor;
        System.out.println("Result: "+result);
    }
}

public class ThrowsDemo {
    public static void main(String[] args) {
        System.out.println("Begin the programm...");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the divident value: ");
        int dividend = scan.nextInt();
        System.out.println("Enter the divisor value: ");
        int divisor = scan.nextInt();
        Demo demo = new Demo();
        try {
            demo.division(dividend, divisor);
        } catch (ArithmeticException e) {
            System.err.println("It is not possible to divide by zero.");
            System.err.println(e.getMessage());
        }
//        demo.division(dividend, divisor);
        System.out.println("End the program...");
    }
}
