package com.fundamental;

class Box {
    int x;
    int y;
    public Box() {
        this(6,8);
        System.out.println("No-arg Constructor");
        System.out.println("x value is : "+x+" y value is : "+y);
    }
    public Box(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("x value is : "+x+" y value is : "+y);
    }
    public Box(String name){
        this();
        System.out.println("This is arg constructor "+name);
    }
    public Box(String name, String location){
        this(name);
        System.out.println("This is arg constructor "+name+" "+location);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Box box = new Box("Ram", "Lucknow");
    }
}
