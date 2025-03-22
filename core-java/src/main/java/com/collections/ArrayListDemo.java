package com.collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();   //Non generice object
        list.add(10);
        list.add("Java");
        list.add(true);
        list.add(99.25f);
        list.add(185.25d);
        list.add('A');
        list.add(1,"FIIT");
        list.add(1,"Ambattur");
        list.set(3,"Java Full-Stack with Angular");
        System.out.println("Non-Generic: "+list);

        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(10);  //Generice object
        list2.add("Java");
        list2.add(true);
        list2.add(99.25f);
        list2.add(185.25d);
        list2.add('A');
        list2.add(1,"FIIT");
        list2.add(1,"Ambattur");
        list2.set(3,"Java Full-Stack with Angular");
        System.out.println("Generic: "+list2);
    }
}
