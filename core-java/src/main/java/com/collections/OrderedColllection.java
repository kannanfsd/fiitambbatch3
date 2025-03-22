package com.collections;

import java.util.*;

public class OrderedColllection {
    public static void main(String[] args) {
        // sample code for ordered collection
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("grape");
        list.add("orange");
        list.add("apple");
        list.add("kiwi");
        list.add("apple");
        System.out.println("Ordered: "+list);
        // sample code for unordered collection
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("grape");
        set.add("orange");
        set.add("apple");
        set.add("kiwi");
        set.add("apple");
        System.out.println("Unordered: "+set);
        // sample code for sorted collection - asc
        Set<String> sortedSet = new TreeSet<>(); // Heap sort
        sortedSet.add("kiwi");
        sortedSet.add("grape");
        sortedSet.add("orange");
        sortedSet.add("banana");
        sortedSet.add("apple");
        sortedSet.add("mango");
        System.out.println("ASC Sorted: "+sortedSet);
        // sample code for sorted collection - desc
        NavigableSet<String> sortedSet2 = new TreeSet<String>().descendingSet(); // Heap sort
        sortedSet2.add("kiwi");
        sortedSet2.add("grape");
        sortedSet2.add("orange");
        sortedSet2.add("banana");
        sortedSet2.add("apple");
        sortedSet2.add("mango");
        System.out.println("DESC Sorted: "+sortedSet2);
    }
}
