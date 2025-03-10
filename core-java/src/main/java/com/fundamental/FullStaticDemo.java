package com.fundamental;

class StaticDemo {
    static String name;
    public static void display3(){
        System.out.println("This is static method outside a class "+name);
    }
    public void display4(){
        System.out.println("This is non-static method outside a class");
    }
}
public class FullStaticDemo {
    public static void display1(){
        System.out.println("This is Non-static within a class");
    }
    public static void display2(){
        System.out.println("This is static within a class");
    }
    public static void main(String[] args) {
        display1();
        display2();
        StaticDemo.name = "John Doe";
        StaticDemo.display3();
        StaticDemo obj1 = new StaticDemo();
        obj1.display4();
    }
}
