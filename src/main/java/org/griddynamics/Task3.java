package org.griddynamics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;


public class Task3 {
    public static void main(String[] args) {
        System.out.println("Task 3 - point 6");
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Abibaba");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        System.out.println("Display names started with A");
        displayNamesStartingWithAAndLongerThan5(memberNames);

        System.out.println("\nDisplay sorted names with lower case");
        displayNamesLowercaseAndSorted(memberNames);

        System.out.println("\nTask 3 - point 7");
        System.out.println("Check if name contain S with anyMatch");
        boolean isMatch = hasAnyNameStartingWithA(memberNames);
        System.out.println("Result: "+isMatch);

        System.out.println("\nCheck if name contain H with noneMatch");
        boolean isNotMatch = containsNoNamesStartingWithH(memberNames);
        System.out.println("Result: "+isNotMatch);

        // Point 8 is part of point 9
        System.out.println("\nTask 3 - point 8");

        System.out.println("\nTask 3 - point 9");
        long counter = countNamesStartingWithA(memberNames);
        System.out.println("Number of names that start with A: "+counter);

        System.out.println("\nTask 3 - point 10");
        String firstName = findFirstNameStartingWithL(memberNames);
        System.out.println(firstName);

    }

    public static void displayNamesStartingWithAAndLongerThan5(List<String> list) {
        list.stream()
                .filter(name -> name.startsWith("A") && name.length()>5)
                .forEach(System.out::println);
    }

    public static void displayNamesLowercaseAndSorted(List<String> list) {
        list.stream()
                .map(String::toLowerCase)
                .sorted()
                .forEach(System.out::println);
    }

    public static boolean hasAnyNameStartingWithA(List<String> list) {
        return list.stream()
                .anyMatch(name -> name.startsWith("A"));
    }

    public static boolean containsNoNamesStartingWithH(List<String> list) {
        return list.stream()
                .noneMatch(name -> name.startsWith("H"));
    }
    public static long countNamesStartingWithA(List<String> list){
        return list.stream()
                .filter(name -> name.startsWith("A"))
                .count();
    }
    public static String findFirstNameStartingWithL(List<String> list){
        return list.stream()
                .filter(name -> name.startsWith("L"))
                .findFirst()
                .orElseGet(() -> "404 - name not found");

    }
}
