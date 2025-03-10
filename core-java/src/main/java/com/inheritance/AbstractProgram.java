package com.inheritance;

abstract class LivingThing{
    int id;
    String name;
    void printMessage() {
        System.out.println("This is abstract class - concrete method.");
    }
    abstract void walk();
}
class Human extends LivingThing{
    void walk() {
        System.out.println("Human is walking.");
    }
}
class Animal extends LivingThing{
    void walk() {
        System.out.println("Animal is walking.");
    }
}

public class AbstractProgram {
    public static void main(String[] args) {

        LivingThing obj = new Human();
        obj.printMessage();
        obj.walk();

        obj = new Animal();     // Runtime Polymorphism
        obj.printMessage();
        obj.walk();

    }
}
