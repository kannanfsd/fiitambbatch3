package com.inheritance;

class Base {
    int num1;
    private int num2;
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    void addition() {
        System.out.println(num1 + num2);
    }
    void subtraction() {
        System.out.println(num1 - num2);
    }

}
class Derived extends Base {
    void multiplication() {
        System.out.println(num1 * getNum2());
    }
    void division() {
        System.out.println(num1 / getNum2());
    }
}

public class FirstProgram {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.num1 = 10;
        obj.setNum2(5);
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
    }
}
