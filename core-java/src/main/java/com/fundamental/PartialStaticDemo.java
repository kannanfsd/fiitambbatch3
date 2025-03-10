package com.fundamental;

public class PartialStaticDemo {
    static int x;
    static int y;
    /**
     * @description - Non static method
     */
    public void display(){
        x=x+8;
        y++;
        System.out.println("x value is : "+x+" y value is : "+y);
    }

    public static void main(String[] args) {
        x = 5;
        y = 3;
        PartialStaticDemo obj1 = new PartialStaticDemo();
        obj1.display();
        obj1.display();
        PartialStaticDemo obj2 = new PartialStaticDemo();
        obj2.display();
        PartialStaticDemo obj3 = new PartialStaticDemo();
        obj3.display();
        obj1.display();
    }
}
