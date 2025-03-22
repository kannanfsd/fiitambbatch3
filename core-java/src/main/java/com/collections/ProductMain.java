package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product("P1", "Laptop", 50000, 10, "Dell");
        Product p2 = new Product("P2", "Mobile", 40000, 20, "Apple");
        Product p3 = new Product("P3", "Tablet", 30000, 15, "Samsung");
        Product p4 = new Product("P4", "Laptop", 50000, 10, "Dell");
        Product p5 = new Product("P5", "Mobile", 40000, 20, "Apple");
        List<Product> pList = new ArrayList<>();   //Non generic object
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        pList.add(p4);
        pList.add(p5);
        ProductManager.printProduct(pList);
    }
}
