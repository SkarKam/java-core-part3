package org.griddynamics;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

public class Task2Test {

    @Test
    public void testListToArray() {
        List<Integer> list = Arrays.asList(3,14,545,21,2);
        int[] expected = {14,2};

        int[] arrayOfInt = Task2.listToArray(list);

        Assert.assertNotNull(arrayOfInt,"Array is empty!");
        Assert.assertEquals(arrayOfInt, expected,"Array contain odd values!");
    }

    @Test
    public void testFilteredList() {
        List<String> list = Arrays.asList("nissan","citroen","cadillac","Chrysler","Daewoo");
        List<String> expected = Arrays.asList("CITROEN","CADILLAC");

        List<String> filtredList = Task2.filtredList(list);

        Assert.assertNotNull(filtredList,"List is empty!");
        Assert.assertEquals(filtredList,expected,"List contains different values than expected!");
    }

}