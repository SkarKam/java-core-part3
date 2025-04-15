package org.griddynamics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Task 2 - point 4");
        List<Integer> list = new ArrayList<Integer>();
        for(int i =0; i<10; i++) {
            list.add(i);
        }
        int[] listByArray = listToArray(list);
        System.out.println(Arrays.toString(listByArray));

        System.out.println("\nTask 2 - point 5");
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<String> filtredList = filtredList(myList);
        System.out.println(filtredList);
    }

    public static int[] listToArray(List<Integer> list) {
        return list.stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    /**
     * Function that filter words that starts on letter c, put them in upper case and sort them in DESC.
     * @param list - list of words
     * @return list of filtered words.
     */
    public static List<String> filtredList(List<String> list) {
        return list.stream()
                .filter(firstLetter -> firstLetter.startsWith("c"))
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}
