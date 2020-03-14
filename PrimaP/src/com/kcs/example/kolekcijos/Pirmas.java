package com.kcs.example.kolekcijos;

import java.util.*;

public class Pirmas {
    public static void main(String[] args) {
        //List
//        List<String> names = new ArrayList<>();
//        names.add("Rimas");
//        names.add("Tomas");
//        for(int i = 0; i<names.size(); i++){
//            System.out.println("List size of " + i + " " + names.get(i));
//        }
        //List<Integer> numbers = List.of(1, 4, 4, 3, 6, 2);
        //System.out.println(numbers.contains(2));

//        for( int i = 0; i<numbers.size(); i++){
//            System.out.println(numbers.get(i));
//        }
//        for (Integer n: numbers){
//            System.out.println(n);
//        }
//        numbers.forEach(System.out::println);
        //Set
//        Set<Integer> numbers = new TreeSet<>();
//        numbers.add(1);
//        numbers.add(4);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(2);
//        numbers.forEach(System.out::println);
        //Map
        Map<Integer, String> cars = new HashMap<>();
        cars.put(2, "Audi");
        cars.put(1, "BMW");
        cars.put(3, "Volvo");
        cars.forEach((k, v) -> System.out.println("Key " + k + " " + "Value " + v));

        for (Integer key: cars.keySet()){
            System.out.println("Key " + key + " val: " + cars.get(key));
        }
    }
}
