package com.collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Object> hashSet1 = new HashSet();
        hashSet1.add("apple");
        hashSet1.add("banana");
        hashSet1.add("mango");
        hashSet1.add("grape");
        hashSet1.add("kiwi");
        hashSet1.add("orange");
        System.out.println(hashSet1);
        HashSet<Object> hashSet2 = new HashSet(); // shallow copy
        hashSet2.addAll(hashSet1);
        System.out.println("hashSet2: "+hashSet2);
        hashSet2.remove("apple");
        System.out.println("hashSet2: "+hashSet2);
    }
}
