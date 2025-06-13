package org.griddynamics;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

public class Task2Test {

    @Test
    @Description("Convert List class to Arrays")
    @Severity(SeverityLevel.CRITICAL)
    public void testListToArray() {

        Allure.label("tag","Converter");

        List<Integer> list = Arrays.asList(3,14,545,21,2);
        int[] expected = {14,2};

        int[] arrayOfInt = Task2.listToArray(list);

        Assert.assertNotNull(arrayOfInt,"Array is empty!");
        Assert.assertEquals(arrayOfInt, expected,"Array contain odd values!");
    }

    @Test
    @Description("Filter item list that name start on letter c. Return list in DESC order")
    @Severity(SeverityLevel.MINOR)
    public void testFilteredList() {

        Allure.label("tag","Collection values operation");
        Allure.label("tag","Filter");

        List<String> list = Arrays.asList("nissan","citroen","cadillac","Chrysler","Daewoo");
        List<String> expected = Arrays.asList("CITROEN","CADILLAC");

        List<String> filtredList = Task2.filtredList(list);

        Assert.assertNotNull(filtredList,"List is empty!");
        Assert.assertEquals(filtredList,expected,"List contains different values than expected!");
    }

}