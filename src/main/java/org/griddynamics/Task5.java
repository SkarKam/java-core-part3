package org.griddynamics;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Task 5");
        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123","s", "555-3389", "a"));
        people.put("Mary", Arrays.asList("555-2243","z", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242", "d"));
        List<String> letterList = getListOfLetters(people);
        System.out.println(letterList);
     }

     public static List<String> getListOfLetters(Map<String,List<String>> map) {
        return map.values().stream()
                .flatMap(List::stream)
                .filter(information -> information.length()==1)
                .toList();
     }
}
