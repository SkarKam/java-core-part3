package org.griddynamics;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Task 1 - point 1");
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(System.out::println);

        System.out.println("\nTask 1 - point 2");
        List<Integer> randomNumbers = generateRandomNumberList();
        randomNumbers.forEach(System.out::println);

        System.out.println("\nTask 1 - point 3");
        List<Integer> evenNumbersList = getEvenNumbersList(randomNumbers);
        System.out.println(evenNumbersList);
    }

    public static List<Integer> generateRandomNumberList() {
        return new Random()
                .ints(20,0,30)
                .boxed()
                .toList();
    }

    public static List<Integer> getEvenNumbersList(List<Integer> numberList) {
        return numberList.stream()
                .filter(i -> i % 2 == 0)
                .toList();

    }
}
