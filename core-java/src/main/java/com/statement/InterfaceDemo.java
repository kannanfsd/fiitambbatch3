package com.statement;

class FinalKeyTest {
    int num1;
    final int num2 = 10;
    void display() {
        System.out.println(num1 + " " + num2);
    }
}

interface Shape{
    double PI = 3.14d;
    public void calculateArea();
    public void calculateVolume();
    default void printDefault() {
        System.out.println("Default Method");
    }
    static void printStatic() {
        System.out.println("Static Method");
    }
}
class Circle implements Shape{
    public void calculateArea() {
        double area = PI * 12.5 * 12.5;
        System.out.println("Area of Circle: "+area);
    }
    public void calculateVolume() {
        System.out.println("Volume of Circle");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.calculateArea();
        obj.calculateVolume();
        obj.printDefault();
        Shape.printStatic();
    }
}
