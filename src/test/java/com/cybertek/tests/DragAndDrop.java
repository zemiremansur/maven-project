package com.cybertek.tests;

import com.cybertek.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DragAndDrop extends TestBase {

    @Test
    public void test() throws InterruptedException {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));
        Thread.sleep(1000);
        // pass the variable in he correct order , first one is source ,second one is target
        actions.dragAndDrop(source, target).perform();
        Thread.sleep(2000);

    }

     @Test

             public void test2() throws InterruptedException {

         driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

         WebElement source = driver.findElement(By.id("draggable"));

         WebElement target = driver.findElement(By.id("droptarget"));
         Thread.sleep(2000);

         // write the steps for doing the drag and drop operation
         // without using the dragAndDrop(); method
         // when we use multiple actions we need to add build() before we perform()
          //build() mean is put the action together .

         actions.clickAndHold(source).moveToElement(target).release().build().perform();

         Thread.sleep(2000);



     }



}
