package org.griddynamics;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class Task4Test {

    @Test
    @Description("Convert type List<List<Integer>> to List<Integer>")
    @Severity(SeverityLevel.CRITICAL)
    public void testConcreteLists() {

        Allure.label("tag","Converter");

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
    @Description("Convert 2-Dimensional array to 1-Dimensional array")
    @Severity(SeverityLevel.CRITICAL)
    public void testConcreteArray2D() {

        Allure.label("tag","Converter");

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
    @Description("Remove all duplicate values from list")
    @Severity(SeverityLevel.NORMAL)
    public void testRemoveDuplications() {

        Allure.label("tag","Collection values operation");
        Allure.label("tag","Remove");

        List<Integer> list = Arrays.asList(1,1,1,2,2,3,5,6,7,6);
        List<Integer> expected = Arrays.asList(1,2,3,5,6,7);

        List<Integer> actual = Task4.removeDuplications(list);

        Assert.assertNotNull(actual,"List is empty!");
        Assert.assertEquals(actual,expected,"List contains different values than expected!");
    }

    @Test
    @Description("Convert List type to Map")
    @Severity(SeverityLevel.CRITICAL)
    public void testListToMap() {

        Allure.label("tag","Converter");

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