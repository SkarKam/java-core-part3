package org.griddynamics;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task3Test {

    @Test
    public void testHasNameStartingWithA() {
        List<String> namelist = Arrays.asList("Adam","Adrian","Stachu","Krzychu");

        boolean contain = Task3.hasAnyNameStartingWithA(namelist);

        Assert.assertTrue(contain,"List have A-name!");
    }

    @Test
    public void testContainsNoNamesStartingWithH() {
        List<String> namelist = Arrays.asList("Adam","Adrian","Stachu","Krzychu");
        boolean notContain = Task3.containsNoNamesStartingWithH(namelist);

        Assert.assertTrue(notContain,"List don't contain H-name!");

        namelist = Arrays.asList("Adam","Hadrian","Stachu","Krzychu");
        notContain = Task3.containsNoNamesStartingWithH(namelist);

        Assert.assertFalse(notContain,"List contain H-name!");
    }

    @Test
    public void testCountNamesStartingWithA() {
        List<String> nameList = Arrays.asList("Adam","Adrian","Stachu","Krzychu","Alan");
        long nameCounter = Task3.countNamesStartingWithA(nameList);

        Assert.assertEquals(nameCounter,3,"Expected 3 names starting with A. Actual: "+nameCounter+"!");
    }

    @Test
    public void testFindFirstNameStartingWithL() {
        List<String> nameList = Arrays.asList("Adam","Adrian","Liam","Lokesh","Alan");
        String name = Task3.findFirstNameStartingWithL(nameList);

        Assert.assertEquals(name,"Liam","Expected name Liam. Actual: "+name);

        nameList = Arrays.asList("Adam","Adrian");
        name = Task3.findFirstNameStartingWithL(nameList);

        Assert.assertEquals(name,"404 - name not found","Expected error 404. Actual: "+name);
    }
}