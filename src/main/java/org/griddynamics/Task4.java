package org.griddynamics;

import java.util.*;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Task 4 - point 11");
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);
        List<List<Integer>> listOfLists = Arrays.asList(list1,list2,list3);
        List<Integer> concrateList = concreteLists(listOfLists);
        System.out.println(concrateList);

        String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
        String[] combinedDataArray = concreteArray2D(dataArray);
        System.out.println(Arrays.toString(combinedDataArray));

        System.out.println("\nTask 4 - point 12");
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));
        List<Integer> numberListWithoutDuplicates = removeDuplications(numbersList);
        System.out.println(numberListWithoutDuplicates);

        System.out.println("\nTask 4 - point 13");
        Map<Integer,Integer> numberMap = listToMap(numbersList);
        System.out.println(numberMap);



    }
    public static List<Integer> concreteLists(List<List<Integer>> listList) {
        return listList.stream()
                .flatMap(Collection::stream)
                .toList();
    }

    public static String[] concreteArray2D(String[][] array2D) {
        return Arrays.stream(array2D)
                .flatMap(Arrays::stream)
                .toArray(String[]::new);
    }

    public static List<Integer> removeDuplications(List<Integer> list) {
        return list.stream()
                .distinct()
                .toList();
    }

    public static Map<Integer,Integer> listToMap(List<Integer> list) {
        return list.stream()
                .collect(Collectors.toMap(key -> key,
                        value -> 1,
                        Integer::sum));
    }
}
