package com.interfaces;

public interface Shape {
    int a = 5;
    int b = 10;
    String SBI_CHN_MCROAD = "SBIN0011234";
    String firstName = "Hello";
    void display();
    void calculateArea();
    void calculateVolume();
    //Java 8+
    default void printMessage1() {
        System.out.println("Default Method");
    }
    static void printMessage2() {
        System.out.println("Static Method");
    }
}
