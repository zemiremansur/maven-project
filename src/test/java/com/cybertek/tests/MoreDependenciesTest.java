package com.cybertek.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoreDependenciesTest {


     @Test
    public void openBrowser(){
        System.out.println("opening browser");

    }

    @Test (dependsOnMethods = "openBrowser")
    public void login(){
        System.out.println("login");
   //    Assert.assertTrue(false);
    }

    @Test (dependsOnMethods = "login" )
    public void logOut(){
        System.out.println("log out");
    }



}
