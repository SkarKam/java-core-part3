package org.griddynamics;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task5Test {

    @Test
    @Description("Convert a Map<String, List<String>> to list for getting an list of letters")
    @Severity(SeverityLevel.BLOCKER)
    public void testGetListOfLetters() {

        Allure.label("tag","Converter");

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