package com.fundamental;

import java.time.LocalTime;
import java.lang.Math;
import java.util.Arrays;

public class Circle {
    public double calculateArea(double radius){
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        System.out.println("Time Now: "+ LocalTime.now());
        Circle circle = new Circle();
        double aoc = circle.calculateArea(12.5);
        System.out.println("Area of Circle: "+aoc);
        System.out.printf("Area of Circle: %.2f", aoc);
    }
}
