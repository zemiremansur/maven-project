package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.omg.CORBA.Current;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DepartmentsTest {
/*
1. open browser
2.go to https://amazon.com
3.verify that default dropdown option is all
4.verify that all options are sorted alphabetically
5.Click on the menu icon on the left
6.click on Full Store directory
7.capture all of the main department namesin the page.
8.verify that departments names are sorted alphabetically
9.verify that all departments names are listed in the dropdown from step 4
 */


    WebDriver driver;
    Select allDepartments;

    @BeforeClass
    public void setUpMethod() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://amazon.com");
    }


    // verify that default dropdown option is all
    @Test(priority = 0)
    public void testDefaultValue() {
        // finding the element with a select tag
        WebElement selectElement = driver.findElement(By.id("searchDropdownBox"));
        // create a Select class object
        allDepartments = new Select(selectElement);
        // get the current selected option
        String selectedOption = allDepartments.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOption, "All");

    }

    //    4.verify that all options are sorted alphabetically
    @Test(priority = 1)
    public void sortAlphabetical() {
        // using the compare to method, we will compare each element in the list to the next one

        for (int i = 0; i < allDepartments.getOptions().size() - 1; i++) {
            String current = allDepartments.getOptions().get(i).getText();
            String next = allDepartments.getOptions().get(i + 1).getText();

            System.out.println("comparing: " + current + " with " + next);

            Assert.assertTrue(current.compareTo(next) <= 0);

        }
    }

    @Test
    public  void mainDepartmentTest(){

        driver.findElement(By.cssSelector("a[href='/gp/site-directory?ref_"));



    }














}