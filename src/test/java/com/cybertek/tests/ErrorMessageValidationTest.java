package com.cybertek.tests;

import com.cybertek.Pages.HomePage;
import com.cybertek.Pages.ListingPage;
import com.cybertek.Pages.PrestasshopHomePage;
import com.cybertek.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import com.sun.xml.internal.ws.policy.AssertionSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessageValidationTest extends TestBase {

    HomePage homePage = new HomePage();


    @Test
    public void wrongEmailTest(){

        HomePage homePage = new HomePage();
        driver.get(ConfigurationReader.getProperty("url"));

        homePage.username.sendKeys("admin");
        homePage.password.sendKeys("test");
        homePage.loginButton.click();

         // driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("admin");  // bu 3 kur diki mazmun bilan aldidiki 3 kur ning roli ohxax.
        //  driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
       // driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String error = "Invalid Login or Password.";
        String actualError = homePage.errorMessage.getText();

        Assert.assertEquals(actualError,error);
    }

    @Test

    public void wrongPasswordTest(){



        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

//        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
//        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(" wrong password");
//        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
//


        homePage.username.sendKeys("Tester");
        homePage.password.sendKeys("wrong password");
        homePage.loginButton.click();



        String extectedError = "Invalid Login or Password.";
        String actualEroor = homePage.errorMessage.getText();

        Assert.assertEquals(extectedError,actualEroor);


    }


     @Test

    public void blankUsername(){

        homePage.open();
        homePage.login("","test");

      String expextedError = "Invalid Login or Password.";
      String actualError = homePage.errorMessage.getText();
      Assert.assertEquals(actualError,expextedError);




  }
  // this is not a method which does not do anything
//
//      @Test
//    public void test(){
//
//          ListingPage nilesLane = new ListingPage();
//
//          ListingPage palmetLane = new ListingPage();
//
//          PrestasshopHomePage prestasshopHomePage = new PrestasshopHomePage();
//
//          WebElement tshirt = prestasshopHomePage.product("tshirt");
//
//          WebElement  dress = prestasshopHomePage.product("dress");
//
//
//
//      }
//
//
//






}
