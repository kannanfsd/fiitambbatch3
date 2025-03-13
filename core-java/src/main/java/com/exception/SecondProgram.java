package com.exception;

public class SecondProgram {
    public static void main(String[] args) {
        System.out.println("Begin the program...");
        //try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("Division Result:  "+c);
        /*}catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }*/
        System.out.println("Continue the program...");
        System.out.println("End the program...");
    }
}
