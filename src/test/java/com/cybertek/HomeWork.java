package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class HomeWork {
    public static void main(String[] args) {

      //  BaaB();
     //   ZeroBank();
      //  SearchAmazon();
        CheckBox();
    }

    public static void BaaB() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://a.testaddressbook.com/sign_in");

        // driver.findElement(By.id("session_email")).sendKeys("kexesobepu@zsero.com");

        WebElement inputEmail = driver.findElement(By.id("session_email"));

        inputEmail.sendKeys("kexesobepu@zsero.com");
        //  Thread.sleep(1500);

        WebElement inputPassword = driver.findElement(By.id("session_password"));
        inputPassword.sendKeys("password");

        //   Thread.sleep(1500);

        WebElement signinButton = driver.findElement(By.name("commit"));
        signinButton.click();

        WebElement currentUserName = driver.findElement(By.className("navbar-text"));


        if (currentUserName.getText().equals("kexesobepu@zsero.com")) {
            System.out.println("Pass | The user name has displayed");
        } else {
            System.out.println("Fail | The user name has not displayed");
        }


        if (driver.getTitle().contains("sign in")) {

            System.out.println("Failed ~~ title contains 'Sign in'");
        } else {
            System.out.println("Pass ~~ title does not contain 'Sign in'");
        }


        //Thread.sleep(2000);

          driver.quit();
        // driver.close();

    }


    public static void ZeroBank() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement inputEmail = driver.findElement(By.id("user_login"));
        inputEmail.sendKeys("username");

        WebElement inputPassword = driver.findElement(By.id("user_password"));
        inputPassword.sendKeys("password");


        WebElement signInButton = driver.findElement(By.name("submit"));

        signInButton.click();

        WebElement curentUser = driver.findElement(By.name(""));


        if (curentUser.getText().equals("username")) {
            System.out.println("Pass | The user name has displayed");
        } else {
            System.out.println("Fail | The user name has not displayed");
        }


        String title = "zero -Account Summary";

        if (driver.getTitle().equals("title")) {

            System.out.println("PASS | title is : " + title);
        } else {

            System.out.println("FAIL | ");
        }
    }




    public static void SearchAmazon(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");

       WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
       search.click();

         String title = "twotabsearchtextbox";

        if (title.contains("twotabsearchtextbox")) {

            System.out.println("Pass ~~ title contain the search term");

        } else {

            System.out.println("Failed ~~ title does not contains search term");
        }

    }



    public static void CheckBox(){


      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();

      driver.get("http://the-internet.herokuapp.com/checkboxes");

      WebElement first = driver.findElement(By.linkText("<input type=\"checkbox\">"));

      String title = "<input type=\"checkbox\">";

      if  (title.contains("<input type=\"checkbox\">")){
          System.out.println("PASS | first box is not selected");
      }else {
          System.out.println("fail |");
      }








    }


}




