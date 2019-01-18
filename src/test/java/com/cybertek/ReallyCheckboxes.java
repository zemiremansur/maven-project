package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ReallyCheckboxes {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
//
//        WebElement monday = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
//
//
////        System.out.print(monday.isSelected());   // verify monday is selected or not
////        monday.click();   // select the monday
//
//
//        System.out.println(monday.isSelected());
//        if (!monday.isSelected()){
//            monday.click();
//    }
//        System.out.println(monday.isSelected());



        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwRadioButton");

        WebElement blue = driver.findElement(By.id("gwt-debug-cwRadioButton-color-blue-input"));
        WebElement  red = driver.findElement(By.id("gwt-debug-cwRadioButton-color-red-input"));

        System.out.println("DEFAULT");
        System.out.println("blue: " + blue.isSelected());
        System.out.println("red : " + red.isSelected());


        System.out.println("blue is clicking...");
        blue.click();


        System.out.println("blue: " + blue.isSelected());
        System.out.println("red : " + red.isSelected());


        System.out.println("red is clicking...");
        red.click();

        System.out.println("blue: " + blue.isSelected());
        System.out.println("red : " + red.isSelected());




//     if (red.isSelected()){
//         blue.click();
//     }else {
//         red.click();
//     }
//














    }
}





