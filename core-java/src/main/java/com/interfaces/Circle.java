package com.interfaces;

public class Circle implements Shape {
    @Override
    public void display() {
        System.out.println("Circle: "+SBI_CHN_MCROAD);
    }
    @Override
    public void calculateArea() {
        System.out.println("Area of Circle");
    }
    @Override
    public void calculateVolume() {
        System.out.println("Volume of Circle");
    }
    public void printMessage() {
        System.out.println("This is Circle class - concrete method.");
    }
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.display();
        circle.calculateArea();
        circle.calculateVolume();
        //circle.printMessage();
        circle.printMessage1(); //default method invoked
        Shape.printMessage2();  //static method invoked
    }
}
