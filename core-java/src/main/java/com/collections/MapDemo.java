package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(4, "C#");
        map.put(5, "C");
        map.put(6, "Rust");
        map.put(7, "Go");
        System.out.println(map);
        System.out.println(map.get(1));
        Set<Integer> keys = map.keySet();
        for(Integer key : keys) {
            System.out.println(map.get(key));
        }
    }
}
