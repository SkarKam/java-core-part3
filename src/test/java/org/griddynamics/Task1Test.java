package org.griddynamics;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

public class Task1Test {


    @Test
    @Description("Testing functionality of random number generator")
    public void testGenerateRandomNumberList() {
        List<Integer> numberList = Task1.generateRandomNumberList();

        Assert.assertNotNull(numberList,"Array is empty!");
        Assert.assertEquals(numberList.size(),20,"Size is not equal 20!");
    }


    @Test
    @Description("Verify that list contains only EVEN numbers")
    public void testGetEvenNumbersList() {
        List<Integer> input = Arrays.asList(0,1, 4, 6, 7 ,85 ,100);
        List<Integer> expected = Arrays.asList(0,4,6,100);

        List<Integer> evenList = Task1.getEvenNumbersList(input);

        Assert.assertNotNull(evenList,"List is empty!");
        Assert.assertEquals(evenList, expected,"List contains odd numbers!");
    }
}