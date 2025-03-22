package com.collections;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        // without generics
        List list = new ArrayList();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        String[] array = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
            array[i] = (String)list.get(i);
        }
        for(String s : array) {
            System.out.println(s);
        }

        // with generics
        List<String> list2 = new ArrayList<>();
        list2.add("Fullstack");
        list2.add("DevOps");
        list2.add("Jenkins");
        String[] array2 = new String[list2.size()];
        for(int i = 0; i < list2.size(); i++) {
            array2[i] = list2.get(i);
        }
        for(String s : array2) {
            System.out.println(s);
        }
    }
}
