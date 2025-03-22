package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("C#");
        list.add("C");
        list.add("Rust");
        list.add("Go");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("mango");
        set.add("grape");
        set.add("kiwi");
        set.add("orange");
        Iterator<String> itr2 = set.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
