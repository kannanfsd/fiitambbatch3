package com.fundamental;

class Overload {
    public void test(){
        System.out.println("Test - Default method.");
    }
    public void test(int a){
        System.out.println("Test - Overloaded method with one int parameter.");
    }
    public void test(int a, int b){
        System.out.println("Test - Overloaded method with two int parameters.");
    }

}
public class OverloadDemo {
    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.test();
        overload.test(1);
        overload.test(1, 2);
    }
}
