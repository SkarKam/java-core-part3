package org.griddynamics;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Task3Test {

    @Test
    @Description("Verify that list contain name starting with letter A")
    @Severity(SeverityLevel.NORMAL)
    public void testHasNameStartingWithA() {

        Allure.label("tag","Collection values operation");
        Allure.label("tag","Contain");

        List<String> namelist = Arrays.asList("Adam","Adrian","Stachu","Krzychu");

        boolean contain = Task3.hasAnyNameStartingWithA(namelist);

        Assert.assertTrue(contain,"List have A-name!");
    }

    @Test
    @Description("Verify that list doesn't contain name starting with letter H")
    @Severity(SeverityLevel.NORMAL)
    public void testContainsNoNamesStartingWithH() {

        Allure.label("tag","Collection values operation");
        Allure.label("tag","Contain");

        List<String> namelist = Arrays.asList("Adam","Adrian","Stachu","Krzychu");
        boolean notContain = Task3.containsNoNamesStartingWithH(namelist);

        Assert.assertTrue(notContain,"List don't contain H-name!");

        namelist = Arrays.asList("Adam","Hadrian","Stachu","Krzychu");
        notContain = Task3.containsNoNamesStartingWithH(namelist);

        Assert.assertFalse(notContain,"List contain H-name!");
    }

    @Test
    @Description("Count names that start with letter A")
    @Severity(SeverityLevel.NORMAL)
    public void testCountNamesStartingWithA() {

        Allure.label("tag","Collection values operation");
        Allure.label("tag","Count");

        List<String> nameList = Arrays.asList("Adam","Adrian","Stachu","Krzychu","Alan");
        long nameCounter = Task3.countNamesStartingWithA(nameList);

        Assert.assertEquals(nameCounter,3,"Expected 3 names starting with A. Actual: "+nameCounter+"!");
    }

    @Test
    @Description("Find first name that start with letter L")
    @Severity(SeverityLevel.NORMAL)
    public void testFindFirstNameStartingWithL() {

        Allure.label("tag","Collection values operation");
        Allure.label("tag","Contain");

        List<String> nameList = Arrays.asList("Adam","Adrian","Liam","Lokesh","Alan");
        String name = Task3.findFirstNameStartingWithL(nameList);

        Assert.assertEquals(name,"Liam","Expected name Liam. Actual: "+name);

        nameList = Arrays.asList("Adam","Adrian");
        name = Task3.findFirstNameStartingWithL(nameList);

        Assert.assertEquals(name,"404 - name not found","Expected error 404. Actual: "+name);
    }
}