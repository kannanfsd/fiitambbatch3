package com.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<String, String> iplTeams = new Hashtable<>();
        iplTeams.put("MI", "Rohit Sharma");
        iplTeams.put("CSK", "Ruthuraj Gaikwad");
        iplTeams.put("RCB", "Virat Kohli");
        iplTeams.put("KKR", "Rishabh Pant");
        iplTeams.put("DC", "Shikhar Dhawan");
        System.out.println(iplTeams);
        for(Map.Entry<String, String> entry : iplTeams.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
