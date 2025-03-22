package com.collections;

import java.util.Iterator;
import java.util.List;

public class ProductManager {
    public static void printProduct(List<Product> list) {
        Iterator<Product> itr = list.iterator();
        while (itr.hasNext()) {
            Product p = itr.next();
            System.out.println(p);
        }
    }
}
