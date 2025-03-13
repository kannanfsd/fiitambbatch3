package com.exception;

public class CheckedExceptionProgram {
    public static void main(String[] args) {
        System.out.println("Begin the program...");
        for(int i=0;i<10;i++) {
            System.out.println("Welcome to Java Programmer...");
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.err.println("Interrupted Exception");
            }
        }
        System.out.println("End the program...");
    }
}
