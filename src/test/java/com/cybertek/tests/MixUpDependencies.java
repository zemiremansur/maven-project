package com.cybertek.tests;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MixUpDependencies {

    @Test()
    public void openBrowser(){
        System.out.println("opening browser");
    }

    @Test(dependsOnMethods = "openBrowser")
    public void login(){
        System.out.println("login");
    }

    @AfterMethod
    public void cleanUp(){
        System.out.println("close browser");
    }

}
