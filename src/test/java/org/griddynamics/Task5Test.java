package org.griddynamics;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.testng.Assert.*;

public class Task5Test {

    @Test
    public void testGetListOfLetters() {
        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123","s", "555-3389", "a"));
        people.put("Mary", Arrays.asList("555-2243","z", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242", "d"));

        List<String> expected = Arrays.asList("d","s","a","z");
        List<String> actual = Task5.getListOfLetters(people);

        Assert.assertNotNull(actual,"List is empty!");
        Assert.assertEquals(actual,expected,"List have different values than expected!");
    }
}