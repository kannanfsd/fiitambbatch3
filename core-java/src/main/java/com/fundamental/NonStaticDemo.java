package com.fundamental;

public class NonStaticDemo {
    int x;
    int y;
    public void display(){
        x=x+8;
        y++;
        System.out.println("x value is : "+x+" y value is : "+y);
    }

    public static void main(String[] args) {
        NonStaticDemo obj1 = new NonStaticDemo();
        obj1.x = 5;
        obj1.y = 3;
        obj1.display();
        obj1.display();
        NonStaticDemo obj2 = new NonStaticDemo();
        obj2.x = 6;
        obj2.y = 4;
        obj2.display();
        NonStaticDemo obj3 = new NonStaticDemo();
        obj3.display();
        obj1.display();
    }
}
