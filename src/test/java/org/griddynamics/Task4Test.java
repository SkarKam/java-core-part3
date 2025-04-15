package org.griddynamics;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class Task4Test {

    @Test
    public void testConcreteLists() {
        List<List<Integer>> listLists = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(9,8,56),
                Arrays.asList(312,42,311)
        );
        List<Integer> expected = Arrays.asList(1,2,3,9,8,56,312,42,311);

        List<Integer> actual = Task4.concreteLists(listLists);

        Assert.assertNotNull(actual,"List is empty!");
        Assert.assertEquals(actual,expected,"List contains different values than expected!");
    }

    @Test
    public void testConcreteArray2D() {
        String[][] array2D = {
                {"alfa","beta"},
                {"gamma","omega"},
                {"pi","rho"},
                {"xi","mu"}
        };
        String[] expected = {"alfa","beta","gamma","omega","pi","rho","xi","mu"};

        String[] actual = Task4.concreteArray2D(array2D);

        Assert.assertNotNull(actual,"Array is empty!");
        Assert.assertEquals(actual,expected,"Array contains different values than expected!");
    }

    @Test
    public void testRemoveDuplications() {
        List<Integer> list = Arrays.asList(1,1,1,2,2,3,5,6,7,6);
        List<Integer> expected = Arrays.asList(1,2,3,5,6,7);

        List<Integer> actual = Task4.removeDuplications(list);

        Assert.assertNotNull(actual,"List is empty!");
        Assert.assertEquals(actual,expected,"List contains different values than expected!");
    }

    @Test
    public void testListToMap() {
        List<Integer> list = Arrays.asList(1,1,2,3,5,8);
        Map<Integer,Integer> expected = new HashMap<>();
        expected.put(1,2);
        expected.put(2,1);
        expected.put(3,1);
        expected.put(5,1);
        expected.put(8,1);

        Map<Integer,Integer> actual = Task4.listToMap(list);

        Assert.assertNotNull(actual,"Map is empty!");
        Assert.assertEquals(actual,expected,"Map has different values than expected!");
    }
}