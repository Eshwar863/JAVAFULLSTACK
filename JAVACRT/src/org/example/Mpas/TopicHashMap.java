package org.example.Mpas;

import java.util.HashMap;
import java.util.Scanner;

public class TopicHashMap {
    public static void main(String[] args) {
        HashMap<Integer ,String >  hm = new HashMap<>();
        hm.put(01,"Uday");
        hm.put(03,"Hari");
        hm.put(05,"Akul");
        hm.put(12,"Eshwar");
        hm.put(17,"NoddyLK");
        hm.put(19,"Kritish");
        hm.get(12);

        Scanner scanner = new Scanner(System.in);
        int input =  scanner.nextInt();
        if(hm.containsKey(input)){
            System.out.println(hm.get(input));
        }
        System.out.println(hm);

        // Print keys
        System.out.println("Keys: " + hm.keySet());

        // Print values
        System.out.println("Values: " + hm.values());

        // Print key-value pairs
        System.out.println("Entries: " + hm.entrySet());

        // Remove entry by key
        String removedValue = hm.remove(input);
        System.out.println("Removed Value: " + removedValue);
    }

    /**
     * Key Features of Map Interface
     * Unique Keys: Keys must be unique within a Map; however, values can be duplicated.
     *
     * Null Handling: Some implementations (like HashMap and LinkedHashMap) allow one null key and multiple null values.
     *
     * Efficient Lookup: Fast retrieval, update, and removal operations via keys.
     *
     * Thread Safety: ConcurrentHashMap or synchronized maps offer thread-safe alternatives when needed.
     *
     * Type Safety: Support for generics allows Maps to be type safe.
     *
     * Common Methods: put(), get(), remove(), containsKey(), containsValue(), keySet(), values(), entrySet(), clear(), size(), etc.
     *
     * */
}
