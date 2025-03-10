package com.inheritance;

class Parent {
    int num1 = 10;
    void printDisplay() {
        System.out.println("This is parent display method.");
    }
}
class Child extends Parent {
    int num1 = 20;
    @Override
    void printDisplay() {
        super.printDisplay();
        System.out.println("This is child display method."+num1+" Parent Data: "+super.num1);
    }
}

public class SecondDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.printDisplay();
    }
}
